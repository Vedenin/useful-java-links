package other_examples;

import org.apache.commons.lang.StringUtils;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Benchmark)
public class FindCountOfOccurrencesBigBenchmark {
    public static final String testString = "a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.da.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d.a.b.c.d" ;

    @Benchmark
    public int countMatches() {
        // Using Apache Commons
        return StringUtils.countMatches(testString, ".");
    }


    @Benchmark
    public int countOccurrencesOf() {
        // Using Spring Framework's
        return org.springframework.util.StringUtils.countOccurrencesOf(testString, ".");
    }

    @Benchmark
    public int replace() {
        // Using replace
        return testString.length() - testString.replace(".", "").length();
    }

    @Benchmark
    public int replaceAll1() {
        // Using replaceAll case 1
        return testString.replaceAll("[^.]", "").length();
    }

    @Benchmark
    public int replaceAll2() {
        // Using replaceAll case 2
        return testString.length() - testString.replaceAll("\\.", "").length();
    }

    @Benchmark
    public int split() {
        // Using split
        return testString.split("\\.",-1).length-1;
    }

    @Benchmark
    public long java8() {
        // Using Java8
        return testString.chars().filter(ch -> ch =='.').count();
    }

    @Benchmark
    public long java8_1() {
        // Using Java8 (case 2)
        return testString.codePoints().filter(ch -> ch == '.').count();
    }

    @Benchmark
    public int stringTokenizer() {
        // Using StringTokenizer
        return new StringTokenizer(" " + testString + " ", ".").countTokens() - 1;
    }

    public static void main(String[] args) throws RunnerException {
        System.out.println("size" + testString.length());
        Options opt = new OptionsBuilder()
                .include(FindCountOfOccurrencesBigBenchmark.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }
}
