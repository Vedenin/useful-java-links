import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import javax.inject.Inject;

/**
 * Guice Field Inject DI Hello World
 *
 *
 * Created by vvedenin on 11/14/2015.
 */
public class GuiceFieldInject {
    public static class Notifier {
        @Inject
        private NotificationService service;

        public void send(String message) {
            service.send("email: " + message);
        }
    }

    public static class EMailService implements NotificationService {
        public void send(String message) {
            System.out.println("I send " + message);
        }
    }

    public interface NotificationService {
        void send(String message);
    }


    public static class TestModule extends AbstractModule {
        @Override
        protected void configure() {
            bind(NotificationService.class).to(EMailService.class);
        }
    }

    public static void main(String[] args)  throws Exception {
        Injector injector = Guice.createInjector(new TestModule());
        Notifier notifier = injector.getInstance(Notifier.class);
        notifier.send("Hello world!"); // Print "I send email: Hello world!"
    }
}
