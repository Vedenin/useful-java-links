import com.google.common.collect.BiMap;
import com.google.common.collect.EnumHashBiMap;

//
public class GuavaEnumHashBiMap {
    enum ENGLISH_WORD {
        ONE, TWO, THREE, BALL, SNOW
    }

    // Task: create collection to translate Polish-English words in two ways
    public static void main(String[] args) {
        ENGLISH_WORD[] englishWords = ENGLISH_WORD.values();
        String[] russianWords = {"jeden", "dwa", "trzy", "kula", "snieg"};

        // Create Multiset
        BiMap<ENGLISH_WORD, String> biMap = EnumHashBiMap.create(ENGLISH_WORD.class);
        // Create English-Polish dictionary
        int i = 0;
        for(ENGLISH_WORD englishWord: englishWords) {
            biMap.put(englishWord, russianWords[i]);
            i++;
        }

        // Print count words
        System.out.println(biMap); // print {ONE=jeden, TWO=dwa, THREE=trzy, BALL=kula, SNOW=snieg}
        // Print all unique words
        System.out.println(biMap.keySet());    // print [ONE, TWO, THREE, BALL, SNOW]
        System.out.println(biMap.values());    // print [jeden, dwa, trzy, kula, snieg]

        // Print translate by words
        System.out.println("one = " + biMap.get(ENGLISH_WORD.ONE));    // print one = jeden
        System.out.println("two = " + biMap.get(ENGLISH_WORD.TWO));    // print two = dwa
        System.out.println("kula = " + biMap.inverse().get("kula"));    // print kula = BALL
        System.out.println("snieg = " + biMap.inverse().get("snieg"));    // print snieg = SNOW
        System.out.println("empty = " + biMap.get("empty"));    // print empty = null

        // Print count word's pair
        System.out.println(biMap.size());    //print 5

    }
}
