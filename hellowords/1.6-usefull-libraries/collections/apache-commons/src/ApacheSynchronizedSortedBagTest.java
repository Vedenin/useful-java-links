import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.collections4.bag.TreeBag;

import java.util.Arrays;

public class ApacheSynchronizedSortedBagTest {

    public static void main(String[] args) {
        // Parse text to separate words
        String INPUT_TEXT = "Hello World! Hello All! Hi World!";
        // Create Multiset
        Bag bag = SynchronizedSortedBag.synchronizedBag(new TreeBag(Arrays.asList(INPUT_TEXT.split(" "))));

        // Print count words
        System.out.println(bag); // print [1:All!,2:Hello,1:Hi,2:World!]- in natural (alphabet) order
        // Print all unique words
        System.out.println(bag.uniqueSet());    // print [All!, Hello, Hi, World!]- in natural (alphabet) order


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
