package mapstruct;

import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;

import static org.dozer.loader.api.TypeMappingOptions.mapNull;

/**
 * Hello World that show simple mapping using api
 *
 * Created by vedenin on 16.04.16.
 */
public class DozerHelloWorldApi {
    public static class Source {
        private String message;

        public Source(String message) {
            this.message = message;
        }

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
        BeanMappingBuilder builder = new BeanMappingBuilder() {
            protected void configure() {
                mapping(Source.class, Destination.class)
                .fields("message", "text");
            }
        };
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.addMapping(builder);

        // convert
        Source source = new Source("Hello World!");
        Destination destObject = mapper.map(source, Destination.class);
        destObject.print(); // print Hello World!
    }
}
