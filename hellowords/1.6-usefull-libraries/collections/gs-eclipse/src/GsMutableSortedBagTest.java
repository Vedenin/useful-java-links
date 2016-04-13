import com.gs.collections.api.bag.sorted.MutableSortedBag;
import com.gs.collections.impl.bag.sorted.mutable.TreeBag;

import java.util.Arrays;

//
public class GsMutableSortedBagTest {

    public static void main(String[] args) {
        // Parse text to separate words
        String INPUT_TEXT = "Hello World! Hello All! Hi World!";
        // Create Multiset
        MutableSortedBag<String> bag =  TreeBag.newBag(Arrays.asList(INPUT_TEXT.split(" ")));

        // Print count words
        System.out.println(bag); // print [All!, Hello, Hello, Hi, World!, World!]- in natural order
        // Print all unique words
        System.out.println(bag.toSortedSet());    // print [All!, Hello, Hi, World!]- in natural order

        // Print count occurrences of words
        System.out.println("Hello = " + bag.occurrencesOf("Hello"));    // print 2
        System.out.println("World = " + bag.occurrencesOf("World!"));    // print 2
        System.out.println("All = " + bag.occurrencesOf("All!"));    // print 1
        System.out.println("Hi = " + bag.occurrencesOf("Hi"));    // print 1
        System.out.println("Empty = " + bag.occurrencesOf("Empty"));    // print 0

        // Print count all words
        System.out.println(bag.size());    //print 6

        // Print count unique words
        System.out.println(bag.toSet().size());    //print 4
    }
}
