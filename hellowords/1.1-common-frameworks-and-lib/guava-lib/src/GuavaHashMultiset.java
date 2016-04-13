import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.Arrays;

//
public class GuavaHashMultiset {

    public static void main(String[] args) {
        // Parse text to separate words
        String INPUT_TEXT = "Hello World! Hello All! Hi World!";
        // Create Multiset
        Multiset<String> multiset = HashMultiset.create(Arrays.asList(INPUT_TEXT.split(" ")));

        // Print count words
        System.out.println(multiset); // print [Hi, Hello x 2, World! x 2, All!] - in random orders
        // Print all unique words
        System.out.println(multiset.elementSet());    // print [Hi, Hello, World!, All!] - in random orders

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
