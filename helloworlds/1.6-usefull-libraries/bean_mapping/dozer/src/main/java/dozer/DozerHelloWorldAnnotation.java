package dozer;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.dozer.Mapping;

/**
 * Hello World that show simple annotation mapping
 *
 * Created by vedenin on 16.04.16.
 */
public class DozerHelloWorldAnnotation {
    public static class Source {
        private String message;

        public Source(String message) {
            this.message = message;
        }

        @Mapping("text")
        public String getMessage() {
            return message;
        }
    }

    public static class Destination {
        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void print() {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        // init mapper
        Mapper mapper = new DozerBeanMapper();

        // convert
        Source source = new Source("Hello World!");
        Destination destObject = mapper.map(source, Destination.class);
        destObject.print(); // print Hello World!
    }
}
