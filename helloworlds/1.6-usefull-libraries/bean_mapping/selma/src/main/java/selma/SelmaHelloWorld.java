package selma;

import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Selma;


/**
 * Hello World that show simple mapping
 *
 *  Before run use maven install
 *
 * Created by vedenin on 16.04.16.
 */
public class SelmaHelloWorld {
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
        TestMapper mapper = Selma.builder(TestMapper.class).build();

        // convert
        Source source = new Source("Hello World!");
        Destination destObject = mapper.sourceToDestination(source);
        destObject.print(); // print Hello World!
    }
}
