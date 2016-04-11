import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by vvedenin on 4/11/2016.
 */
public class HelloWordsTest {
    @Test
    public void test() throws Exception {
        System.out.println("FiberHelloWorld:");
        assertThat(FiberHelloWorld.doTest(), is(10));
        System.out.println("FiberSleepHelloWorld:");
        assertThat(FiberSleepHelloWorld.doTest(), is(2));
        System.out.println("FibersAndChanelHelloWorld:");
        assertThat(FibersAndChanelHelloWorld.doTest(), is(10));
    }
}
