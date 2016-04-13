package dagger;

import javax.inject.Inject;

/**
 * Simple Dagger DI Hello World
 *
 *
 * Created by vvedenin on 11/14/2015.
 */
public class SimpleDaggerDI {
    public static class Notifier {
        private final NotificationService service;

        @Inject
        public Notifier(NotificationService service) {
            this.service = service;
        }

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

    @Module
    public static class TestModule {
        @Provides
        NotificationService provideNotificationService() {
            return new EMailService();
        }

        @Provides Notifier provideNotifier(NotificationService service) {
            return new Notifier(service);
        }
    }

    @Component(modules = TestModule.class)
    interface TestComponent {
        Notifier getNotifier();
    }

    public static void main(String[] args)  throws Exception {
        TestComponent testComponent = DaggerSimpleDaggerDI_TestComponent.create();
        Notifier notifier = testComponent.getNotifier();
        notifier.send("Hello world!");  // Напечатает "I send email: Hello world!"
    }
}
