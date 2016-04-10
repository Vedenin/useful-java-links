import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;

import java.util.*;

public class ApacheMultiValueMapTreeTest {

    // Task: parser string with text and show all indexes of all words
    public static void main(String[] args) {
        String INPUT_TEXT = "Hello World! Hello All! Hi World!";
        // Parse text to words and index
        List<String> words = Arrays.asList(INPUT_TEXT.split(" "));
        // Create Multimap
        MultiMap<String, Integer> multiMap =  MultiValueMap.multiValueMap(new TreeMap<String, Set>(), TreeSet.class);

        // Fill Multimap
        int i = 0;
        for(String word: words) {
            multiMap.put(word, i);
            i++;
        }

        // Print all words
        System.out.println(multiMap); // print {All!=[3], Hello=[0, 2], Hi=[4], World!=[1, 5]} -in natural order
        // Print all unique words
        System.out.println(multiMap.keySet());    // print [All!, Hello, Hi, World!] in natural order

        // Print all indexes
        System.out.println("Hello = " + multiMap.get("Hello"));    // print [0, 2]
        System.out.println("World = " + multiMap.get("World!"));    // print [1, 5]
        System.out.println("All = " + multiMap.get("All!"));    // print [3]
        System.out.println("Hi = " + multiMap.get("Hi"));    // print [4]
        System.out.println("Empty = " + multiMap.get("Empty"));    // print null

        // Print count unique words
        System.out.println(multiMap.keySet().size());    //print 4
    }
}
