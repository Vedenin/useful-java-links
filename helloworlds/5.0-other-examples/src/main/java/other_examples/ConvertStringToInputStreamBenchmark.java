package other_examples;

import com.google.common.io.CharSource;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.ReaderInputStream;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

/**
 * Created by vvedenin on 2/15/2016.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Benchmark)
public class ConvertStringToInputStreamBenchmark {
    private static final String test1 = "test184768612876481276487612876417826487216478216784621784672816478216784621784621786478216478216784261784621782178647281647821647821697421687126784621874621786478216478216874";

    /*             1. Using ToInputStream of Apache Utils */
    @Benchmark
    public InputStream apacheToInputStream() throws IOException {
        return IOUtils.toInputStream(test1, StandardCharsets.UTF_8);
    }

    /*             2. Using JDK */
    @Benchmark
    public InputStream jdkByteArrayInputStream() throws IOException {
        return new ByteArrayInputStream(test1.getBytes(StandardCharsets.UTF_8));
    }

    /*             3. Using ReaderInputStream of Apache Utils */
    @Benchmark
    public InputStream apacheReaderInputStream() throws IOException {
        return new ReaderInputStream(CharSource.wrap(test1).openStream());
    }

    /*             4. Using Apache Utils and InputStreamReader*/
    @Benchmark
    public InputStream apacheInputStreamReader() throws IOException {
        return IOUtils.toInputStream(test1);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(ConvertStringToInputStreamBenchmark.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }

}
