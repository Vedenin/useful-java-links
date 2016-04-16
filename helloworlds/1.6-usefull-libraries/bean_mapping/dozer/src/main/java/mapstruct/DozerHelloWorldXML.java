package mapstruct;

import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello World that show simple xml mapping
 *
 * Created by vedenin on 16.04.16.
 */
public class DozerHelloWorldXML {
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
        new DozerHelloWorldXML().test();
    }

    private void test() {
        // init mapper
        List<String> myMappingFiles = new ArrayList<String>();
        myMappingFiles.add("mapping.xml");
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.setMappingFiles(myMappingFiles);

        // convert
        Source source = new Source("Hello World!");
        Destination destObject = mapper.map(source, Destination.class);
        destObject.print(); // print Hello World!;
    }
}
