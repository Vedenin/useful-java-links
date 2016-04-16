package modelmapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

/**
 * Hello World that show simple annotation mapping
 *
 * Created by vedenin on 16.04.16.
 */
public class ModelMapperHelloWorld {
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
        PropertyMap<Source, Destination> orderMap = new PropertyMap<Source, Destination>() {
            protected void configure() {
                map().setText(source.getMessage());
            }
        };
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(orderMap);

        // convert
        Source source = new Source("Hello World!");
        Destination destObject = modelMapper.map(source, Destination.class);
        destObject.print(); // print Hello World!
    }
}
