import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;

import java.util.Arrays;

//
public class GuavaTreeMultiset {

    public static void main(String[] args) {
        // Parse text to separate words
        String INPUT_TEXT = "Hello World! Hello All! Hi World!";
        // Create Multiset
        Multiset<String> multiset = TreeMultiset.create(Arrays.asList(INPUT_TEXT.split(" ")));

        // Print count words
        System.out.println(multiset); // print [All!, Hello x 2, Hi, World! x 2]- in natural (alphabet) order
        // Print all unique words
        System.out.println(multiset.elementSet());    // print [All!, Hello, Hi, World!]- in natural (alphabet) order

        // Print count occurrences of words
        System.out.println("Hello = " + multiset.count("Hello"));    // print 2
        System.out.println("World = " + multiset.count("World!"));    // print 2
        System.out.println("All = " + multiset.count("All!"));    // print 1
        System.out.println("Hi = " + multiset.count("Hi"));    // print 1
        System.out.println("Empty = " + multiset.count("Empty"));    // print 0

        // Print count all words
        System.out.println(multiset.size());    //print 6

        // Print count unique words
        System.out.println(multiset.elementSet().size());    //print 4
    }
}
