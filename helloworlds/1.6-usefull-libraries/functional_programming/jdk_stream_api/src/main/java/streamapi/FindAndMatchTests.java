package streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * Find and match example of Stream Api
 *
 * Created by vedenin on 17 .10.15.
 */
public class FindAndMatchTests {
    private static void testFindFirstSkipCount() {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");

        System.out.println("Test findFirst and skip start");
        // get first element of collection
        String first = collection.stream().findFirst().orElse("1");
        System.out.println("first = " + first); // print  first = a1

        // get last element of collection
        String last = collection.stream().skip(collection.size() - 1).findAny().orElse("1");
        System.out.println("last = " + last ); // print  last = a1

        // find element in collection
        String find = collection.stream().filter("a3"::equals).findFirst().get();
        System.out.println("find = " + find); // print  find = a3

        // find 3 element in collection
        String third = collection.stream().skip(2).findFirst().get();
        System.out.println("third = " + third); // print  third = a3

        System.out.println();
        System.out.println("Test collect start");
        // get all element according pattern
        List<String> select = collection.stream().filter((s) -> s.contains("1")).collect(Collectors.toList());
        System.out.println("select = " + select); // print  select = [a1, a1]
    }

    private static void testMatch() {
        System.out.println();
        System.out.println("Test anyMatch, allMatch, noneMatch  start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");

        // find that collection has at least one element according pattern
        boolean isAnyOneTrue = collection.stream().anyMatch("a1"::equals);
        System.out.println("anyOneTrue " + isAnyOneTrue); // print  true
        boolean isAnyOneFalse = collection.stream().anyMatch("a8"::equals);
        System.out.println("anyOneFlase " + isAnyOneFalse); // print  false

        // find that all element in collection mathed with pattern or not
        boolean isAll = collection.stream().allMatch((s) -> s.contains("1"));
        System.out.println("isAll " + isAll); // print  false

        // compare is not equals
        boolean isNotEquals = collection.stream().noneMatch("a7"::equals);
        System.out.println("isNotEquals " + isNotEquals); // print  true
    }

    public static void main(String[] args)  throws Exception {
        testFindFirstSkipCount();
        testMatch();
    }
}
