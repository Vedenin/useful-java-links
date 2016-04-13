import com.gs.collections.api.bimap.MutableBiMap;
import com.gs.collections.impl.bimap.mutable.HashBiMap;

//
public class GsHashBiMapTest {

    // Task: create collection to translate Polish-English words in two ways
    public static void main(String[] args) {
        String[] englishWords = {"one", "two", "three","ball","snow"};
        String[] russianWords = {"jeden", "dwa", "trzy", "kula", "snieg"};

        // Create Multiset
        MutableBiMap<String, String> biMap = new HashBiMap(englishWords.length);
        // Create English-Polish dictionary
        int i = 0;
        for(String englishWord: englishWords) {
            biMap.put(englishWord, russianWords[i]);
            i++;
        }

        // Print count words
        System.out.println(biMap); // print {two=dwa, ball=kula, one=jeden, snow=snieg, three=trzy} - in random orders
        // Print all unique words
        System.out.println(biMap.keySet());    // print [snow, two, one, three, ball] - in random orders
        System.out.println(biMap.values());    // print [dwa, kula, jeden, snieg, trzy] - in random orders

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
