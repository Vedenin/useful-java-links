package mapstruct;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Hello World that show simple annotation mapping
 *
 * Before run use maven install
 * Created by vedenin on 16.04.16.
 */
public class MapStructHelloWorld {
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

    @Mapper
    public interface TestMapper {
        @Mapping(source = "message", target = "text")
        Destination sourceToDestination(Source source);
    }

    public static void main(String[] args) {
        // convert
        Source source = new Source("Hello World!");
        Destination destObject = new TestMapperImpl().sourceToDestination(source);
        destObject.print(); // print Hello World!
    }
}
