package jsr330;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;

/**
 * Hello World using jsr330 annotation
 *
 * Created by vvedenin on 11/14/2015.
 */
public class SpringSimpleInject {
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

    @Configuration
    public static class DIConfiguration {
        @Bean
        public Notifier getNotifier(NotificationService service){
            return new Notifier(service);
        }

        @Bean
        public NotificationService getNotificationService(){
            return new EMailService();
        }
    }

    public static void main(String[] args)  throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        Notifier notifier =  context.getBean(Notifier.class);
        notifier.send("Hello world!"); // Print "I send email: Hello world!"
    }
}
