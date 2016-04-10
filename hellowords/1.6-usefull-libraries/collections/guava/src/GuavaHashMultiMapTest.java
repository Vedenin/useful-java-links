package com.github.vedenin.eng.collections.multimap;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import java.util.Arrays;
import java.util.List;

//  Attention: version with russian comments in "rus" package
public class GuavaHashMultiMapTest {

    // Task: parser string with text and show all indexes of all words
    public static void main(String[] args) {
        String INPUT_TEXT = "Hello World! Hello All! Hi World!";
        // Parse text to words and index
        List<String> words = Arrays.asList(INPUT_TEXT.split(" "));
        // Create Multimap
        Multimap<String, Integer> multiMap = HashMultimap.create();

        // Fill Multimap
        int i = 0;
        for(String word: words) {
            multiMap.put(word, i);
            i++;
        }

        // Print all words
        System.out.println(multiMap); // print {Hi=[4], Hello=[0, 2], World!=[1, 5], All!=[3]} - keys and values in random orders
        // Print all unique words
        System.out.println(multiMap.keySet());    // print [Hi, Hello, World!, All!] - in random orders

        // Print all indexes
        System.out.println("Hello = " + multiMap.get("Hello"));    // print [0, 2]
        System.out.println("World = " + multiMap.get("World!"));    // print [1, 5]
        System.out.println("All = " + multiMap.get("All!"));    // print [3]
        System.out.println("Hi = " + multiMap.get("Hi"));    // print [4]
        System.out.println("Empty = " + multiMap.get("Empty"));    // print []

        // Print count all words
        System.out.println(multiMap.size());    //print 6

        // Print count unique words
        System.out.println(multiMap.keySet().size());    //print 4
    }
}
