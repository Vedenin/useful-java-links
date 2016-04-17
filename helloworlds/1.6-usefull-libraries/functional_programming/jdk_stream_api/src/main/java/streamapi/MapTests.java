package streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * Map examples of Stream Api
 *
 * Created by vedenin on 17 .10.15.
 */
public class MapTests {
    private static void testMap() {
        System.out.println();
        System.out.println("Test map start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // Change all elements
        List<String> transform = collection.stream().map((s) -> s + "_1").collect(Collectors.toList());
        System.out.println("transform = " + transform); // print  transform = [a1_1, a2_1, a3_1, a1_1]

        // Delete first char of element and returns number
        List<Integer> number = collection.stream().map((s) -> Integer.parseInt(s.substring(1))).collect(Collectors.toList());
        System.out.println("number = " + number); // print  transform = [1, 2, 3, 1]

    }

    private static void testMapToInt() {
        System.out.println();
        System.out.println("Test mapToInt start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // Delete first char of element and returns number
        int[] number = collection.stream().mapToInt((s) -> Integer.parseInt(s.substring(1))).toArray();
        System.out.println("number = " + Arrays.toString(number)); // print  number = [1, 2, 3, 1]

    }

    private static void testFlatMap() {
        System.out.println();
        System.out.println("Test flat map start");
        Collection<String> collection = Arrays.asList("1,2,0", "4,5");
        // Get all digit from strings
        String[] number = collection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);
        System.out.println("number = " + Arrays.toString(number)); // print  number = [1, 2, 0, 4, 5]
    }

    private static void testFlatMapToInt() {
        System.out.println();
        System.out.println("Test flat map start");
        Collection<String> collection = Arrays.asList("1,2,0", "4,5");
        // Get sum all digit from strings
        int sum = collection.stream().flatMapToInt((p) -> Arrays.asList(p.split(",")).stream().mapToInt(Integer::parseInt)).sum();
        System.out.println("sum = " + sum); // print  sum = 12
    }

    public static void main(String[] args)  throws Exception {
        testMap();
        testMapToInt();
        testFlatMap();
        testFlatMapToInt();
    }
}
