import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;


//
public class GuavaBiMapTest {

    // Task: create collection to translate Polish-English words in two ways
    public static void main(String[] args) {
        String[] englishWords = {"one", "two", "three","ball","snow"};
        String[] russianWords = {"jeden", "dwa", "trzy", "kula", "snieg"};

        // Create Multiset
        BiMap<String, String> biMap = HashBiMap.create(englishWords.length);
        // Create English-Polish dictionary
        int i = 0;
        for(String englishWord: englishWords) {
            biMap.put(englishWord, russianWords[i]);
            i++;
        }

        // Print count words
        System.out.println(biMap); // print {two=dwa, three=trzy, snow=snieg, ball=kula, one=jeden} - in random orders
        // Print all unique words
        System.out.println(biMap.keySet());    // print [two, three, snow, ball, one] - in random orders
        System.out.println(biMap.values());    // print [dwa, trzy, snieg, kula, jeden]- in random orders

        // Print translate by words
        System.out.println("one = " + biMap.get("one"));    // print one = jeden
        System.out.println("two = " + biMap.get("two"));    // print two = dwa
        System.out.println("kula = " + biMap.inverse().get("kula"));    // print kula = ball
        System.out.println("snieg = " + biMap.inverse().get("snieg"));    // print snieg = snow
        System.out.println("empty = " + biMap.get("empty"));    // print empty = null

        // Print count word's pair
        System.out.println(biMap.size());    //print 5

    }
}
