package com.github.vedenin.eng.collections.bimap;

import com.google.common.collect.BiMap;
import com.google.common.collect.EnumBiMap;

//  Attention: version with russian comments in "rus" package
public class GuavaEnumBiMapTest {
    enum ENGLISH_WORD {
        ONE, TWO, THREE, BALL, SNOW
    }
    enum POLISH_WORD {
        JEDEN, DWA, TRZY, KULA, SNIEG
    }

    // Task: create collection to translate Polish-English words in two ways
    public static void main(String[] args) {
        ENGLISH_WORD[] englishWords = ENGLISH_WORD.values();
        POLISH_WORD[] polishWords = POLISH_WORD.values();

        // Create Multiset
        BiMap<ENGLISH_WORD, POLISH_WORD> biMap = EnumBiMap.create(ENGLISH_WORD.class, POLISH_WORD.class);
        // Create English-Polish dictionary
        int i = 0;
        for(ENGLISH_WORD englishWord: englishWords) {
            biMap.put(englishWord, polishWords[i]);
            i++;
        }

        // Print count words
        System.out.println(biMap); // print {ONE=JEDEN, TWO=DWA, THREE=TRZY, BALL=KULA, SNOW=SNIEG}
        // Print all unique words
        System.out.println(biMap.keySet());    // print [ONE, TWO, THREE, BALL, SNOW]
        System.out.println(biMap.values());    // print [JEDEN, DWA, TRZY, KULA, SNIEG]

        // Print translate by words
        System.out.println("one = " + biMap.get(ENGLISH_WORD.ONE));    // print one = JEDEN
        System.out.println("two = " + biMap.get(ENGLISH_WORD.TWO));    // print two = DWA
        System.out.println("kula = " + biMap.inverse().get(POLISH_WORD.KULA));    // print kula = BALL
        System.out.println("snieg = " + biMap.inverse().get(POLISH_WORD.SNIEG));    // print snieg = SNOW
        System.out.println("empty = " + biMap.get("empty"));    // print empty = null

        // Print count word's pair
        System.out.println(biMap.size());    //print 5

    }
}
