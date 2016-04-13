import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

/**
 *  Hello World using Apache BidiMap
 */
public class ApacheBidiMap {

    // Task: create collection to translate Polish-English words in two ways
    public static void main(String[] args) {
        String[] englishWords = {"one", "two", "three","ball","snow"};
        String[] russianWords = {"jeden", "dwa", "trzy", "kula", "snieg"};

        // Create Multiset
        BidiMap<String, String> biMap = new DualHashBidiMap();
        // Create Polish-English dictionary
        int i = 0;
        for(String englishWord: englishWords) {
            biMap.put(englishWord, russianWords[i]);
            i++;
        }

        // Print count words
        System.out.println(biMap); // Print "{ball=kula, snow=snieg, one=jeden, two=dwa, three=trzy}" - in random orders
        // Print unique words
        System.out.println(biMap.keySet());    // print "[ball, snow, one, two, three]"- in random orders
        System.out.println(biMap.values());    // print "[kula, snieg, jeden, dwa, trzy]" - in random orders

        // Print translate by words
        System.out.println("one = " + biMap.get("one"));    // print one = jeden
        System.out.println("two = " + biMap.get("two"));    // print two = dwa
        System.out.println("kula = " + biMap.getKey("kula"));    // print kula = ball
        System.out.println("snieg = " + biMap.getKey("snieg"));    // print snieg = snow
        System.out.println("empty = " + biMap.get("empty"));    // print empty = null

        // Print count word's pair
        System.out.println(biMap.size());    //print 5

    }
}
