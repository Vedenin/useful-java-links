#### **I. Ways to convert an InputStream to a String:**

From this [StackOverflow post](http://stackoverflow.com/questions/309424/read-convert-an-inputstream-to-a-string/35446009#35446009):

Summarize other answers I found 11 main ways to do this (see below). And I wrote some performance tests (see results below):

**Ways to convert an InputStream to a String:**

1. Using **IOUtils.toString** (`Apache Utils`) 

        String result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);

2. Using **CharStreams** (`guava`) 

        String result = CharStreams.toString(new InputStreamReader(
              inputStream, Charsets.UTF_8));


3. Using `Scanner` (**JDK**) 

        Scanner s = new Scanner(inputStream).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";

4. Using **Stream Api** (`Java 8`). **Warning**: This solution convert different linebreaks (like `\r\n`) to `\n`.
   

        String result = new BufferedReader(new InputStreamReader(inputStream))
          .lines().collect(Collectors.joining("\n"));
       
5. Using **parallel Stream Api** (`Java 8`). **Warning**: This solution convert different linebreaks (like `\r\n`) to `\n`.    

        String result = new BufferedReader(new InputStreamReader(inputStream)).lines()
           .parallel().collect(Collectors.joining("\n"));

6. Using **InputStreamReader** and **StringBuilder** (`JDK`) 

        final int bufferSize = 1024;
        final char[] buffer = new char[bufferSize];
        final StringBuilder out = new StringBuilder();
        Reader in = new InputStreamReader(inputStream, "UTF-8");
        for (; ; ) {
            int rsz = in.read(buffer, 0, buffer.length);
            if (rsz < 0)
                break;
            out.append(buffer, 0, rsz);
        }
        return out.toString();

7. Using **StringWriter** and **IOUtils.copy** (`Apache Commons`)

        StringWriter writer = new StringWriter();
        IOUtils.copy(inputStream, writer, "UTF-8");
        return writer.toString();

8. Using **ByteArrayOutputStream** and **inputStream.read** (`JDK`)  

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }
        return result.toString("UTF-8");

9. Using **BufferedReader** (`JDK`). **Warning:** This solution convert different linebreaks (like `\n\r`) to `line.separator` system property (for example, in Windows to "\r\n").

        String newLine = System.getProperty("line.separator");
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder result = new StringBuilder();
        String line; boolean flag = false;
        while ((line = reader.readLine()) != null) {
            result.append(flag? newLine: "").append(line);
            flag = true;
        }
        return result.toString();

10. Using **BufferedInputStream** and **ByteArrayOutputStream** (`JDK`) 

        BufferedInputStream bis = new BufferedInputStream(inputStream);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        int result = bis.read();
        while(result != -1) {
            buf.write((byte) result);
            result = bis.read();
        }
        return buf.toString();

11. Using **inputStream.read()** and **StringBuilder**  (`JDK`). **Warning**: This soulition has problem with Unicode, for example with Russian text (work correctly only with non-Unicode text) 

        int ch;
        StringBuilder sb = new StringBuilder();
        while((ch = inputStream.read()) != -1)
            sb.append((char)ch);
        reset();
        return sb.toString();

**Warning**:

 1. Solutions `4`, `5` and `9` convert different linebreaks to one.

 2. Soulution `11` can't work correclty with Unicode text

**Perfomance tests**

Perfomance tests for small `String` (length = 175), url in [this][1] (mode = AverageTime, system = Linux, score 1,343 is the best):

                  Benchmark                        Mode  Cnt   Score   Error  Units
    8. ByteArrayOutputStream and read (JDK)        avgt   10   1,343 ± 0,028  us/op
    6. InputStreamReader and StringBuilder (JDK)   avgt   10   6,980 ± 0,404  us/op
    10.BufferedInputStream, ByteArrayOutputStream  avgt   10   7,437 ± 0,735  us/op
    11.InputStream.read() and StringBuilder (JDK)  avgt   10   8,977 ± 0,328  us/op
    7. StringWriter and IOUtils.copy (Apache)      avgt   10  10,613 ± 0,599  us/op
    1. IOUtils.toString (Apache Utils)             avgt   10  10,605 ± 0,527  us/op
    3. Scanner (JDK)                               avgt   10  12,083 ± 0,293  us/op
    2. CharStreams (guava)                         avgt   10  12,999 ± 0,514  us/op
    4. Stream Api (Java 8)                         avgt   10  15,811 ± 0,605  us/op
    9. BufferedReader (JDK)                        avgt   10  16,038 ± 0,711  us/op
    5. parallel Stream Api (Java 8)                avgt   10  21,544 ± 0,583  us/op

Perfomance tests for big `String` (length = 50100), url in [this][2] (mode = AverageTime, system = Linux, score 200,715 is the best):

                  Benchmark                        Mode  Cnt   Score        Error  Units
    8. ByteArrayOutputStream and read (JDK)        avgt   10   200,715 ±   18,103  us/op
    1. IOUtils.toString (Apache Utils)             avgt   10   300,019 ±    8,751  us/op
    6. InputStreamReader and StringBuilder (JDK)   avgt   10   347,616 ±  130,348  us/op
    7. StringWriter and IOUtils.copy (Apache)      avgt   10   352,791 ±  105,337  us/op
    2. CharStreams (guava)                         avgt   10   420,137 ±   59,877  us/op
    9. BufferedReader (JDK)                        avgt   10   632,028 ±   17,002  us/op
    5. parallel Stream Api (Java 8)                avgt   10   662,999 ±   46,199  us/op
    4. Stream Api (Java 8)                         avgt   10   701,269 ±   82,296  us/op
    10.BufferedInputStream, ByteArrayOutputStream  avgt   10   740,837 ±    5,613  us/op
    3. Scanner (JDK)                               avgt   10   751,417 ±   62,026  us/op
    11.InputStream.read() and StringBuilder (JDK)  avgt   10  2919,350 ± 1101,942  us/op

Graphs (perfomance tests depending on Input Stream length in Windows 7 system)    
[![enter image description here][3]][3]

Perfomance test (AverageTime) depending on Input Stream length in Windows 7 system:

     length  182	546	    1092	3276	9828	29484	58968
    
     test8 	0.38	0.938	1.868	4.448	13.412	36.459	72.708
     test4 	2.362	3.609	5.573	12.769	40.74	81.415	159.864
     test5 	3.881	5.075	6.904	14.123	50.258	129.937	166.162
     test9 	2.237	3.493	5.422	11.977	45.98	89.336	177.39
     test6 	1.261	2.12	4.38	10.698	31.821	86.106	186.636
     test7 	1.601	2.391	3.646	8.367	38.196	110.221	211.016
     test1 	1.529	2.381	3.527	8.411	40.551	105.16	212.573
     test3 	3.035	3.934	8.606	20.858	61.571	118.744	235.428
     test2 	3.136	6.238	10.508	33.48	43.532	118.044	239.481
     test10 1.593	4.736	7.527	20.557	59.856	162.907	323.147
     test11 3.913	11.506	23.26	68.644	207.591	600.444	1211.545

#### **II. Ways to efficiently iterate over each Entry in a Map:**
From this [StackOverflow post](http://stackoverflow.com/a/35558955/4318868):

Summarize other answers and what I known, I found 10 main ways to do this (see below). And I wrote some performance tests (see results below), for example, if we want to find sum of all keys and values of map, we can write :

 1. Using **iterator** and **Map.Entry**

        long i = 0;
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> pair = it.next();
            i += pair.getKey() + pair.getValue();
        }

 2. Using **foreach** and **Map.Entry**

        long i = 0;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            i += pair.getKey() + pair.getValue();
        }

 3. Using **foreach** from `Java 8`

        final long[] i = {0};
        map.forEach((k, v) -> i[0] += k + v);
       
 4. Using **keySet** and **foreach**

        long i = 0;
        for (Integer key : map.keySet()) {
            i += key + map.get(key);
        }

 5. Using **keySet** and **iterator**

        long i = 0;
        Iterator<Integer> itr2 = map.keySet().iterator();
        while (itr2.hasNext()) {
            Integer key = itr2.next();
            i += key + map.get(key);
        }

 6. Using **for** and **Map.Entry**

        long i = 0;
        for (Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator(); entries.hasNext(); ) {
            Map.Entry<Integer, Integer> entry = entries.next();
            i += entry.getKey() + entry.getValue();
        }

 7. Using `Java 8` **Stream Api**

        final long[] i = {0};
        map.entrySet().stream().forEach(e -> i[0] += e.getKey() + e.getValue());

 8. Using `Java 8` **Stream Api parallel**

        final long[] i = {0};
        map.entrySet().stream().parallel().forEach(e -> i[0] += e.getKey() + e.getValue());

 9. Using **IterableMap** of `Apache Collections`

        long i = 0;
        MapIterator<Integer, Integer> it = iterableMap.mapIterator();
        while (it.hasNext()) {
            i += it.next() + it.getValue();
        }

 10. Using **MutableMap** of `Eclipse (CS) collections`

        final long[] i = {0};
        mutableMap.forEachKeyValue((key, value) -> {
            i[0] += key + value;
        });

**Perfomance tests** (mode = AverageTime, system = Win 8.1 64-bit, Intel i7-4790 3.60GHz 3.60GHz, 16 GB)

1) For small map (100 elements),  score 0.308 is the best

           Benchmark                      Mode  Cnt     Score      Error  Units
    test3_UsingForEachAndJava8            avgt   10     0.308 ±    0.021  us/op
    test10_UsingEclipseMap                avgt   10     0.309 ±    0.009  us/op
    test1_UsingWhileAndMapEntry           avgt   10     0.380 ±    0.014  us/op
    test6_UsingForAndIterator             avgt   10     0.387 ±    0.016  us/op
    test2_UsingForEachAndMapEntry         avgt   10     0.391 ±    0.023  us/op
    test7_UsingJava8StreamApi             avgt   10     0.510 ±    0.014  us/op
    test9_UsingApacheIterableMap          avgt   10     0.524 ±    0.008  us/op
    test4_UsingKeySetAndForEach           avgt   10     0.816 ±    0.026  us/op
    test5_UsingKeySetAndIterator          avgt   10     0.863 ±    0.025  us/op
    test8_UsingJava8StreamApiParallel     avgt   10     5.552 ±    0.185  us/op


2) For map with 10000 elements,  score 37.606 is the best

           Benchmark                    Mode  Cnt     Score      Error  Units
    test10_UsingEclipseMap              avgt   10    37.606 ±    0.790  us/op
    test3_UsingForEachAndJava8          avgt   10    50.368 ±    0.887  us/op
    test6_UsingForAndIterator           avgt   10    50.332 ±    0.507  us/op
    test2_UsingForEachAndMapEntry       avgt   10    51.406 ±    1.032  us/op
    test1_UsingWhileAndMapEntry         avgt   10    52.538 ±    2.431  us/op
    test7_UsingJava8StreamApi           avgt   10    54.464 ±    0.712  us/op
    test4_UsingKeySetAndForEach         avgt   10    79.016 ±   25.345  us/op
    test5_UsingKeySetAndIterator        avgt   10    91.105 ±   10.220  us/op
    test8_UsingJava8StreamApiParallel   avgt   10   112.511 ±    0.365  us/op
    test9_UsingApacheIterableMap        avgt   10   125.714 ±    1.935  us/op

3) For map with 100000 elements,  score 1184.767 is the best

           Benchmark                   Mode  Cnt     Score      Error  Units
    test1_UsingWhileAndMapEntry        avgt   10  1184.767 ±  332.968  us/op
    test10_UsingEclipseMap             avgt   10  1191.735 ±  304.273  us/op
    test2_UsingForEachAndMapEntry      avgt   10  1205.815 ±  366.043  us/op
    test6_UsingForAndIterator          avgt   10  1206.873 ±  367.272  us/op
    test8_UsingJava8StreamApiParallel  avgt   10  1485.895 ±  233.143  us/op
    test5_UsingKeySetAndIterator       avgt   10  1540.281 ±  357.497  us/op
    test4_UsingKeySetAndForEach        avgt   10  1593.342 ±  294.417  us/op
    test3_UsingForEachAndJava8         avgt   10  1666.296 ±  126.443  us/op
    test7_UsingJava8StreamApi          avgt   10  1706.676 ±  436.867  us/op
    test9_UsingApacheIterableMap       avgt   10  3289.866 ± 1445.564  us/op

Graphs (perfomance tests depending on map size)

[![enter image description here][4]][4]

Table (perfomance tests depending on map size)

    	     100	 600	 1100	 1600	 2100
    test10 	0.333	1.631	2.752	5.937	8.024
    test3 	0.309	1.971	4.147	8.147	10.473
    test6 	0.372	2.19	4.47	8.322	10.531
    test1 	0.405	2.237	4.616	8.645	10.707
    test2 	0.376	2.267	4.809	8.403	10.91
    test7 	0.473	2.448	5.668	9.79	12.125
    test9 	0.565	2.83	5.952	13.22	16.965
    test4 	0.808	5.012	8.813	13.939	17.407
    test5 	0.81	5.104	8.533	14.064	17.422
    test8 	5.173	12.499	17.351	24.671	30.403

All test in [this][5]

#### **III. Count the number of occurrences of a char or substring in a string:**
From this [StackOverflow post](http://stackoverflow.com/a/35242882/4318868):

Summarize other answer and what I know all ways to do this using a one-liner:

       String testString = "a.b.c.d";

1) Using **Apache Commons**

    int apache = StringUtils.countMatches(testString, ".");
    System.out.println("apache = " + apache);

2) Using **Spring Framework's**

    int spring = org.springframework.util.StringUtils.countOccurrencesOf(testString, ".");
    System.out.println("spring = " + spring);

3) Using **replace**

    int replace = testString.length() - testString.replace(".", "").length();
    System.out.println("replace = " + replace);

4) Using **replaceAll** (case 1)

    int replaceAll = testString.replaceAll("[^.]", "").length();
    System.out.println("replaceAll = " + replaceAll);

5) Using **replaceAll** (case 2)

    int replaceAllCase2 = testString.length() - testString.replaceAll("\\.", "").length();
    System.out.println("replaceAll (second case) = " + replaceAllCase2);

6) Using **split**

    int split = testString.split("\\.",-1).length-1;
    System.out.println("split = " + split);

7)  Using **Java8** (case 1)

    long java8 = testString.chars().filter(ch -> ch =='.').count();
    System.out.println("java8 = " + java8);

8)  Using **Java8** (case 2), may be better for unicode then case 1

    long java8Case2 = testString.codePoints().filter(ch -> ch =='.').count();
    System.out.println("java8 (second case) = " + java8Case2);

9)   Using **StringTokenizer**

    int stringTokenizer = new StringTokenizer(" " +testString + " ", ".").countTokens()-1;
    System.out.println("stringTokenizer = " + stringTokenizer);

**From comment**: Be carefull for the StringTokenizer, for a.b.c.d it will work but for a...b.c....d or ...a.b.c.d or a....b......c.....d... or etc. it will not work. It just will count for . between characters just once


More info in [github][6]

[Perfomance test][6] (using [JMH][7], mode = AverageTime, score `0.010` better then `0.351`): 

    Benchmark              Mode  Cnt  Score    Error  Units
    1. countMatches        avgt    5  0.010 ±  0.001  us/op
    2. countOccurrencesOf  avgt    5  0.010 ±  0.001  us/op
    3. stringTokenizer     avgt    5  0.028 ±  0.002  us/op
    4. java8_1             avgt    5  0.077 ±  0.005  us/op
    5. java8_2             avgt    5  0.078 ±  0.003  us/op
    6. split               avgt    5  0.137 ±  0.009  us/op
    7. replaceAll_2        avgt    5  0.302 ±  0.047  us/op
    8. replace             avgt    5  0.303 ±  0.034  us/op
    9. replaceAll_1        avgt    5  0.351 ±  0.045  us/op


 
  [1]: https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/5.0-other-examples/src/main/java/other_examples/ConvertInputStreamToStringBenchmark.java
  [2]: https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/5.0-other-examples/src/main/java/other_examples/ConvertBigStringToInputStreamBenchmark.java
  [3]: http://i.stack.imgur.com/AYYhz.png
  [4]: https://i.stack.imgur.com/17VGh.png
  [5]: https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/5.0-other-examples/src/main/java/other_examples/IterateThroughHashMapTest.java
  [6]: https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/5.0-other-examples/src/main/java/other_examples/FindCountOfOccurrencesBenchmark.java
  [7]: http://openjdk.java.net/projects/code-tools/jmh/

