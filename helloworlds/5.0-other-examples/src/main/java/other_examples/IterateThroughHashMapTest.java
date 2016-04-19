package other_examples;

import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.HashedMap;
import org.eclipse.collections.api.map.MutableMap;
import org.eclipse.collections.impl.map.mutable.UnifiedMap;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by vvedenin on 2/21/2016.
 */
@State(Scope.Benchmark)
public class IterateThroughHashMapTest {
    private final static Integer SIZE = 100;

    @Param({"100","1000"})
    public int size;

    private Map<Integer, Integer> map = new HashMap<>(SIZE);

    /** 1. Using iterator and Map.Entry **/
    @Benchmark
    public long test1_UsingWhileAndMapEntry() throws IOException {
        long i = 0;
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> pair = it.next();
            i += pair.getKey() + pair.getValue();
        }
        return i;
    }

    /** 2. Using foreach and Map.Entry **/
    @Benchmark
    public long test2_UsingForEachAndMapEntry() throws IOException {
        long i = 0;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            i += pair.getKey() + pair.getValue();
        }
        return i;
    }

    /** 3. Using foreach from Java 8 **/
    @Benchmark
    public long test3_UsingForEachAndJava8() throws IOException {
        final long[] i = {0};
        map.forEach((k, v) -> i[0] += k + v);
        return i[0];
    }

    /** 4. Using keySet and foreach **/
    @Benchmark
    public long test4_UsingKeySetAndForEach() throws IOException {
        long i = 0;
        for (Integer key : map.keySet()) {
            i += key + map.get(key);
        }
        return i;
    }

    /** 5. Using keySet and iterator **/
    @Benchmark
    public long test5_UsingKeySetAndIterator() throws IOException {
        long i = 0;
        Iterator<Integer> itr2 = map.keySet().iterator();
        while (itr2.hasNext()) {
            Integer key = itr2.next();
            i += key + map.get(key);
        }
        return i;
    }

    /** 6. Using for and Map.Entry **/
    @Benchmark
    public long test6_UsingForAndIterator() throws IOException {
        long i = 0;
        for (Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator(); entries.hasNext(); ) {
            Map.Entry<Integer, Integer> entry = entries.next();
            i += entry.getKey() + entry.getValue();
        }
        return i;
    }

    /** 7. Using Java 8 Stream Api **/
    @Benchmark
    public long test7_UsingJava8StreamApi() throws IOException {
        final long[] i = {0};
        map.entrySet().stream().forEach(e -> i[0] += e.getKey() + e.getValue());
        return i[0];
    }

    /** 8. Using Java 8 Stream Api parallel **/
    @Benchmark
    public long test8_UsingJava8StreamApiParallel() throws IOException {
        final long[] i = {0};
        map.entrySet().stream().parallel().forEach(e -> i[0] += e.getKey() + e.getValue());
        return i[0];
    }

    /** 9. Using Apache IterableMap **/
    private IterableMap<Integer, Integer> iterableMap = new HashedMap<>(SIZE);
    @Benchmark
    public long test9_UsingApacheIterableMap() throws IOException {
        long i = 0;
        MapIterator<Integer, Integer> it = iterableMap.mapIterator();
        while (it.hasNext()) {
            i += it.next() + it.getValue();
        }
        return i;
    }

    /** 10. Using MutableMap of Eclipse (CS) collections **/
    private MutableMap<Integer, Integer> mutableMap = UnifiedMap.newMap(SIZE);
    @Benchmark
    public long test10_UsingEclipseMap() throws IOException {
        final long[] i = {0};
        mutableMap.forEachKeyValue((key, value) -> {
            i[0] += key + value;
        });
        return i[0];
    }

    /** 11. Using Java 8 Stream Api 2 **/
    @Benchmark
    public long test11_UsingJava8StreamApi2() throws IOException {
        return map.entrySet().stream().mapToLong(e -> e.getKey() + e.getValue()).sum();
    }

    /** 12. Using Java 8 Stream Api parallel 2  **/
    @Benchmark
    public long test12_UsingJava8StreamApiparallel2() throws IOException {
        return map.entrySet().parallelStream().mapToLong(e -> e.getKey() + e.getValue()).sum();
    }

    @TearDown(Level.Iteration)
    public void tearDown() {
        map = new HashMap<>(size);
        iterableMap = new HashedMap<>(size);
        mutableMap = UnifiedMap.newMap(size);
        for (int i = 0; i < size; i++) {
            map.put(i, i);
            mutableMap.put(i, i);
            iterableMap.put(i, i);
        }
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(IterateThroughHashMapTest.class.getSimpleName())
                .timeUnit(TimeUnit.MICROSECONDS)
                .warmupIterations(3)
                .measurementIterations(5)
                .param("size","100",/*"500","900","1300","1700","2100","2500","5000","10000","15000","20000","25000" ,*/ "30000")
                .forks(1)
                .mode(Mode.AverageTime)
                .build();

        new Runner(opt).run();
    }
}
