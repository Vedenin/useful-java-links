package orika;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;


/**
 * Hello World that show simple mapping
 *
 * Created by vedenin on 16.04.16.
 */
public class OrikaHelloWorld {
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
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(Source.class, Destination.class).
                field("message", "text").register();
        MapperFacade mapper = mapperFactory.getMapperFacade();

        // convert
        Source source = new Source("Hello World!");
        Destination destObject = mapper.map(source, Destination.class);
        destObject.print(); // print Hello World!
    }
}
