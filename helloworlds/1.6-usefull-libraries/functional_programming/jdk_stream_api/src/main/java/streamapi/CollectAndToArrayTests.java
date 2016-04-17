package streamapi;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Collect of Stream Api examples
 * <p>
 * Created by vedenin on 17 .10.15.
 */
public class CollectAndToArrayTests {

    private static void testCollect() {
        System.out.println();
        System.out.println("Test distinct start");

        // ******** Work with numbers
        Collection<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        // Get sum of all odd numbers
        long sumOdd = numbers.stream().collect(Collectors.summingInt(((p) -> p % 2 == 1 ? p : 0)));
        System.out.println("sumOdd = " + sumOdd); // print  sumEven = 4

        // Subtract 1 to every element and get average
        double average = numbers.stream().collect(Collectors.averagingInt((p) -> p - 1));
        System.out.println("average = " + average); // print  average = 1.5

        // Add 3 to every element and get statisics
        IntSummaryStatistics statistics = numbers.stream().collect(Collectors.summarizingInt((p) -> p + 3));
        System.out.println("statistics = " + statistics); // print  statistics = IntSummaryStatistics{count=4, sum=22, min=4, average=5.500000, max=7}

        // Get sum all even number using IntSummaryStatistics
        long sumEven = numbers.stream().collect(Collectors.summarizingInt((p) -> p % 2 == 0 ? p : 0)).getSum();
        System.out.println("sumEven = " + sumEven); // print  sumEven = 6

        // Split all number to odd and even
        Map<Boolean, List<Integer>> parts = numbers.stream().collect(Collectors.partitioningBy((p) -> p % 2 == 0));
        System.out.println("parts = " + parts); // print  parts = {false=[1, 3], true=[2, 4]}

        // ******** Work with strings
        Collection<String> strings = Arrays.asList("a1", "b2", "c3", "a1");

        // Get list of string without duplicate
        List<String> distinct = strings.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct = " + distinct); // print  distinct = [a1, b2, c3]

        // Get array of string without duplicate
        String[] array = strings.stream().distinct().map(String::toUpperCase).toArray(String[]::new);
        System.out.println("array = " + Arrays.asList(array)); // print  array = [A1, B2, C3]

        // Join all element to one string using template:  "<b> v1 : v2 : ... vN </b>"
        String join = strings.stream().collect(Collectors.joining(" : ", "<b> ", " </b>"));
        System.out.println("join = " + join); // print  <b> a1 : b2 : c3 : a1 </b>

        // Transform to map, when first char is key, second char - value
        Map<String, String> map = strings.stream().distinct().collect(Collectors.toMap((p) -> p.substring(0, 1), (p) -> p.substring(1, 2)));
        System.out.println("map = " + map); // print  map = {a=1, b=2, c=3}

        // Transform to map, with grouping by first char
        Map<String, List<String>> groups = strings.stream().collect(Collectors.groupingBy((p) -> p.substring(0, 1)));
        System.out.println("groups = " + groups); // print  groups = {a=[a1, a1], b=[b2], c=[c3]}

        // Transform to map, with grouping by first char and value is join second chars
        Map<String, String> groupJoin = strings.stream().collect(Collectors.groupingBy((p) -> p.substring(0, 1), Collectors.mapping((p) -> p.substring(1, 2), Collectors.joining(":"))));
        System.out.println("groupJoin = " + groupJoin); // print  groupJoin = groupJoin = {a=1/1, b=2, c=3}

        // Create custom Collector, that join string using StringBuilder
        Collector<String,StringBuilder, String> stringBuilderCollector =  Collector.of(
                StringBuilder::new, // method accumulator's initialization
                (b ,s) -> b.append(s).append(" , "), // method that working with every element
                (b1, b2) -> b1.append(b2).append(" , "), // method that join to accumulator's
                StringBuilder::toString // method that finished working
        );
        String joinBuilder = strings.stream().collect(stringBuilderCollector);
        System.out.println("joinBuilder = " + joinBuilder); // print  joinBuilder = a1 , b2 , c3 , a1 ,

        // Analog Collector using JDK7-
        StringBuilder b = new StringBuilder(); // method accumulator's initialization
        for(String s: strings) {
            b.append(s).append(" , "); // method that working with every element
        }
        String joinBuilderOld = b.toString(); // method that finished working
        System.out.println("joinBuilderOld = " + joinBuilderOld); // print  joinBuilderOld = a1 , b2 , c3 , a1 ,
    }

    public static void main(String[] args) throws Exception {
        testCollect();
    }
}
