import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;

import java.util.Arrays;

//
public class GuavaLinkedHashMultiset {

    public static void main(String[] args) {
        // Parse text to separate words
        String INPUT_TEXT = "Hello World! Hello All! Hi World!";
        // Create Multiset
        Multiset<String> multiset = LinkedHashMultiset.create(Arrays.asList(INPUT_TEXT.split(" ")));

        // Print count words
        System.out.println(multiset); // print [Hello x 2, World! x 2, All!, Hi]- in predictable iteration order
        // Print all unique words
        System.out.println(multiset.elementSet());    // print [Hello, World!, All!, Hi] - in predictable iteration order

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
