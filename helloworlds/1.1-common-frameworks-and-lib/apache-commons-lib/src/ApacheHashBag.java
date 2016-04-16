import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

import java.util.Arrays;

/**
 *  Hello World using Apache HashBag
 */
public class ApacheHashBag {

    public static void main(String[] args) {
        // Parse text to separate words
        String INPUT_TEXT = "Hello World! Hello All! Hi World!";
        // Create Multiset
        Bag bag = new HashBag(Arrays.asList(INPUT_TEXT.split(" ")));

        // Print count words
        System.out.println(bag); // print [1:Hi,2:Hello,2:World!,1:All!] - in random orders
        // Print all unique words
        System.out.println(bag.uniqueSet());    // print [Hi, Hello, World!, All!] - in random orders

        // Print count occurrences of words
        System.out.println("Hello = " + bag.getCount("Hello"));    // print 2
        System.out.println("World = " + bag.getCount("World!"));    // print 2
        System.out.println("All = " + bag.getCount("All!"));    // print 1
        System.out.println("Hi = " + bag.getCount("Hi"));    // print 1
        System.out.println("Empty = " + bag.getCount("Empty"));    // print 0

        // Print count all words
        System.out.println(bag.size());    //print 6

        // Print count unique words
        System.out.println(bag.uniqueSet().size());    //print 4
    }
}
