package streamapi;

import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * Create Stream Api examples
 *
 * Created by vedenin on 17 .10.15.
 */
public class BuildTests {
    // All way to create Stream
    private static void testBuildStream() throws Exception {
        System.out.println("Test buildStream start");

        // Create Stream from values
        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");
        System.out.println("streamFromValues = " + streamFromValues.collect(Collectors.toList())); // print  streamFromValues = [a1, a2, a3]

        // Create Stream from array
        String[] array = {"a1","a2","a3"};
        Stream<String> streamFromArrays = Arrays.stream(array);
        System.out.println("streamFromArrays = " + streamFromArrays.collect(Collectors.toList())); // print  streamFromArrays = [a1, a2, a3]

        Stream<String> streamFromArrays1 = Stream.of(array);
        System.out.println("streamFromArrays1 = " + streamFromArrays1.collect(Collectors.toList())); // print  streamFromArrays = [a1, a2, a3]

        // Create Stream from file
        File file = new File("1.tmp");
        file.deleteOnExit();
        PrintWriter out = new PrintWriter(file);
        out.println("a1");
        out.println("a2");
        out.println("a3");
        out.close();

        Stream<String> streamFromFiles = Files.lines(Paths.get(file.getAbsolutePath()));
        System.out.println("streamFromFiles = " + streamFromFiles.collect(Collectors.toList())); // print  streamFromFiles = [a1, a2, a3]

        // Create Stream from collection
        Collection<String> collection = Arrays.asList("a1", "a2", "a3");
        Stream<String> streamFromCollection = collection.stream();
        System.out.println("streamFromCollection = " + streamFromCollection.collect(Collectors.toList())); // print  streamFromCollection = [a1, a2, a3]

        // Create Stream from string
        IntStream streamFromString = "123".chars();
        System.out.print("streamFromString = ");
        streamFromString.forEach((e)->System.out.print(e + " , ")); // print  streamFromString = 49 , 50 , 51 ,
        System.out.println();

        // Using Stream.builder
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> streamFromBuilder = builder.add("a1").add("a2").add("a3").build();
        System.out.println("streamFromBuilder = " + streamFromBuilder.collect((Collectors.toList()))); // print  streamFromFiles = [a1, a2, a3]

        // Create infinite stream
        // Using Stream.iterate
        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 2);
        System.out.println("streamFromIterate = " + streamFromIterate.limit(3).collect(Collectors.toList())); // print  streamFromIterate = [1, 3, 5]

        // Using Stream.generate
        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");
        System.out.println("streamFromGenerate = " + streamFromGenerate.limit(3).collect(Collectors.toList())); // print  streamFromGenerate = [a1, a1, a1]

        // Create empty stream
        Stream<String> streamEmpty = Stream.empty();
        System.out.println("streamEmpty = " + streamEmpty.collect(Collectors.toList())); // print  streamEmpty = []

        // Create parallel Stream from collection
        Stream<String> parallelStream = collection.parallelStream();
        System.out.println("parallelStream = " + parallelStream.collect(Collectors.toList())); // print  parallelStream = [a1, a2, a3]

        // Create stream from path
        Stream<Path> streamFromPath = Files.list(Paths.get(""));
        System.out.println("streamFromPath = " + streamFromPath.collect(Collectors.toList())); // print list of files

        // Create stream from finding files
        Stream<Path> streamFromFind = Files.find(Paths.get(""), 10, (p,a) -> true);
        System.out.println("streamFromFind = " + streamFromFind.collect(Collectors.toList())); // print list of files

        // Create stream from files tree
        Stream<Path> streamFromFileTree = Files.walk(Paths.get(""));
        System.out.println("streamFromFileTree = " + streamFromFileTree.collect(Collectors.toList())); // print list of files

        // Create stream from Pattern
        Stream<String> streamFromPattern = Pattern.compile(":")
                .splitAsStream("a1:a2:a3");
        System.out.println("streamFromPattern = " + streamFromPattern.collect(Collectors.joining(","))); // print a1,a2,a3

        // Create stream from BufferedReader
        Path path = Files.write(Paths.get("./test.txt"), "test 1\ntest 2".getBytes()); // create temp file

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            Stream<String> streamFromBufferedReader = reader.lines();
            System.out.println("streamFromBufferedReader = " + streamFromBufferedReader.collect(Collectors.toList())); // print [test 1, test 2]
        }
    }

    public static void main(String[] args)  throws Exception {
        testBuildStream();
    }


}
