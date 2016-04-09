import smile.data.AttributeDataset;
import smile.data.Datum;
import smile.data.parser.ArffParser;

import java.util.Arrays;

/**
 * Created by vedenin on 09.04.16.
 */
public class SmileHelloWorld {

    public static void main(String[] args) throws Exception {
        SmileHelloWorld cls = new SmileHelloWorld();
        cls.LoadArff();
    }

    private void LoadArff() throws Exception {
        ArffParser arffParser = new ArffParser();
        arffParser.setResponseIndex(4);
        AttributeDataset weather = arffParser.parse(this.getClass().getResourceAsStream("weather.nominal.arff"));
        println("name" + weather.getName());
        println("responce " + weather.response());
        println("attributes = " + Arrays.toString(weather.attributes()));
        println("Data: ");
        println("          x          :  y  : weight");
        weather.forEach((x) -> println(Arrays.toString(x.x) + " : " + x.y + " : " + x.weight));
    }

    private static void println(String text) {
        System.out.println(text);
    }
}
