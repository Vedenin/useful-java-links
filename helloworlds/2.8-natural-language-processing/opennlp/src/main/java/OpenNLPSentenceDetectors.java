import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.util.Span;

import java.io.InputStream;
import java.util.Arrays;

/**
 * Hello World for OpenNLP
 *
 * Created by vedenin on 06.04.16.
 */
public class OpenNLPSentenceDetectors {
    private static final String RESOURCES_EN_SENT_BIN = "en-sent.bin";

    private String[] testOpenNLP(String text) throws Exception {
        try (InputStream modelIn = this.getClass().getResourceAsStream(RESOURCES_EN_SENT_BIN)) {
            SentenceModel model = new SentenceModel(modelIn);
            SentenceDetectorME sentenceDetector = new SentenceDetectorME(model);
            return sentenceDetector.sentDetect(text);
        }
    }


    private Span[] testOpenNLPPosition(String text) throws Exception {
        try (InputStream modelIn = this.getClass().getResourceAsStream(RESOURCES_EN_SENT_BIN)) {
            SentenceModel model = new SentenceModel(modelIn);
            SentenceDetectorME sentenceDetector = new SentenceDetectorME(model);
            return sentenceDetector.sentPosDetect(text);
        }
    }


    public static void main(String[] strings) throws Exception {
        String text = "Hello World! 'But I don’t want to go among mad people,' Alice remarked. " +
                "'Oh, you can’t help that,' said the Cat: 'we’re all mad here. I’m mad. You’re mad.' " +
                "'How do you know I’m mad?' said Alice. " +
                "'You must be,' said the Cat, 'or you wouldn’t have come here.'";

        OpenNLPSentenceDetectors cls = new OpenNLPSentenceDetectors();
        println("OpenNLP:");
        printArray(cls.testOpenNLP(text));
        println();
        println("OpenNLP Positions:");
        printArray(cls.testOpenNLPPosition(text));
    }

    private static <T> void printArray(T[] array) {
        Arrays.asList(array).stream().forEach(System.out::println);
    }

    private static <T> void println(T obj) {
        System.out.println(obj);
    }

    private static void println() {
        System.out.println();
    }
}
