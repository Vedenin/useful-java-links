import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Setter DI injection Hello World using Java annotation
 *
 * Created by vvedenin on 11/14/2015.
 */
public class SpringSetterAutowired {
    public static class Notifier {
        private NotificationService service;

        @Autowired
        public void setService(NotificationService service) {
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
            return new Notifier();
        }

        @Bean
        public NotificationService getNotificationService(){
            return new EMailService();
        }
    }

    public static void main(String[] args)  throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        Notifier notifier =  context.getBean(Notifier.class);
        notifier.send("Hello World!"); // Print "I send email: Hello World!"
    }
}
