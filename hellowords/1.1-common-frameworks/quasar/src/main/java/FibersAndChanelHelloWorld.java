import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.strands.SuspendableCallable;
import co.paralleluniverse.strands.SuspendableRunnable;
import co.paralleluniverse.strands.channels.Channels;
import co.paralleluniverse.strands.channels.IntChannel;

/**
 * Created by vvedenin on 4/11/2016.
 */
public class FibersAndChanelHelloWorld {

    public static Integer doTest() throws Exception {
        final IntChannel fiber1ToFiber2 = Channels.newIntChannel(0); // Synchronizing channel (buffer = 0)
        final IntChannel fiber2ToFiber1 = Channels.newIntChannel(0); // Synchronizing channel (buffer = 0)

        Fiber<Integer> fiber1 = new Fiber<>("Fiber1", new SuspendableCallable<Integer>() {
            @Override
            public Integer run() throws SuspendExecution, InterruptedException {
                Fiber.sleep(1000);
                fiber1ToFiber2.send(1);
                Integer i1 = fiber2ToFiber1.receive();
                System.out.println(" Hello words " + i1);
                fiber1ToFiber2.send(9);
                Integer i2 = fiber2ToFiber1.receive();
                System.out.println(" Hello words " + i2);
                fiber1ToFiber2.send(0);
                return i2;
            }
        }).start();

        Fiber<Void> fiber2 = new Fiber<Void>("Fiber2", new SuspendableRunnable() { @Override public void run() throws SuspendExecution, InterruptedException {
            Integer i;
            i = fiber1ToFiber2.receive();
            while(i != 0) {
                fiber2ToFiber1.send(i + 1);
                i = fiber1ToFiber2.receive();
            }
        } }).start();


         fiber1.join();
         fiber2.join();

        return fiber1.get();

    }
}
