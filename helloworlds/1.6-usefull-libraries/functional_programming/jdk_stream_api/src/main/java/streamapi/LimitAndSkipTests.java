package streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * Limit and skip examples of Stream Api
 *
 * Created by vedenin on 17 .10.15.
 */
public class LimitAndSkipTests {
    private static void testLimit() {
        System.out.println();
        System.out.println("Test limit start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");

        // Get the first two elements
        List<String> limit = collection.stream().limit(2).collect(Collectors.toList());
        System.out.println("limit = " + limit); // print  limit = [a1, a2]

        // Get two elements from second element
        List<String> fromTo = collection.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println("fromTo = " + fromTo); // print  fromTo = [a2, a3]

        // Get the last element
        String last = collection.stream().skip(collection.size() - 1).findAny().orElse("1");
        System.out.println("last = " + last ); // print  last = a1
    }

    public static void main(String[] args)  throws Exception {
        testLimit();
    }
}
