package xml.jsr300;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.inject.Inject;

/**
 * Hello World using jsr300 annotation and XML config
 *
 * Created by vvedenin on 11/14/2015.
 */
public class XmlConstructorInjectHelloWorld {
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

    public static void main(String[] args)  throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "constructorInject.xml");
        Notifier notifier =  context.getBean(Notifier.class);
        notifier.send("Hello world!"); // Print "I send email: Hello world!"
    }
}
