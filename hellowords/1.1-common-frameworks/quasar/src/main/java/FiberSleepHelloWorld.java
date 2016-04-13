import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.SuspendExecution;

import java.util.concurrent.ExecutionException;

/**
 * Simple HelloWorld using Fiber and sleep
 *
 *  To run using "maven test"
 *
 * Created by vvedenin on 4/11/2016.
 */
public class FiberSleepHelloWorld {
    public static Integer doTest() throws ExecutionException, InterruptedException {
        System.out.println("Hello world1!");
        Fiber<Integer> integerFiber = new Fiber<Integer>() {
            @Override
            protected Integer run() throws SuspendExecution, InterruptedException {
                System.out.println("Hello world2!");
                Fiber.sleep(1000);
                System.out.println("Hello world3!");
                return 2;
            }
        }.start();
        System.out.println("Hello world4!");
        Integer result = integerFiber.get();
        System.out.println("Hello world5!");
        return result;
    }
}
