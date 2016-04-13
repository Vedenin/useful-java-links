

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.gs.collections.api.collection.MutableCollection;
import com.gs.collections.api.list.MutableList;
import com.gs.collections.api.ordered.OrderedIterable;
import com.gs.collections.impl.list.mutable.FastList;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Testing search method using guava, apache, jdk, gs
 *
 *
 *
 * Created by vedenin on 17 .10.15.
 */
public class CollectionSearchTests {
    // Get frequency element in collection
    private static void testCount() {
        Collection<String> collection = Lists.newArrayList("a1", "a2", "a3", "a1");
        Iterable<String> iterable = collection;
        MutableCollection<String> collectionGS = FastList.newListWith("a1", "a2", "a3", "a1");

        // Get frequency element in collection
        int i1 = Iterables.frequency(iterable, "a1"); // using guava
        int i2 = Collections.frequency(collection, "a1"); // using JDK
        int i3 = CollectionUtils.cardinality("a1", iterable); // using Apache
        int i4 = collectionGS.count("a1"::equals);
        long i5 = collection.stream().filter("a1"::equals).count(); // using stream JDK

        System.out.println("count = " + i1 + ":" + i2 + ":" + i3 + ":" + i4 + ":" + i5); // print count = 2:2:2:2:2
    }

    // get first element
    private static void testGetFirst() {
        Collection<String> collection = Lists.newArrayList("a1", "a2", "a3", "a1");
        OrderedIterable<String> orderedIterable = FastList.newListWith("a1", "a2", "a3", "a1");
        Iterable<String> iterable = collection;

        // get first element
        Iterator<String> iterator = collection.iterator(); // using JDK
        String jdk = iterator.hasNext() ? iterator.next(): "1";
        String guava = Iterables.getFirst(iterable, "1"); // using guava
        String apache = CollectionUtils.get(iterable, 0);  // using Apache
        String gs = orderedIterable.getFirst(); // using GS
        String stream = collection.stream().findFirst().orElse("1"); // using Stream API
        System.out.println("first = " + jdk + ":" + guava + ":" + apache + ":" + gs + ":" + stream); // print first = a1:a1:a1:a1:a1
    }

    // get last element
    private static void testGetLast() {
        Collection<String> collection = Lists.newArrayList("a1", "a2", "a3", "a8");
        OrderedIterable<String> orderedIterable = FastList.newListWith("a1", "a2", "a3", "a8");
        Iterable<String> iterable = collection;

        // get last element
        Iterator<String> iterator = collection.iterator(); // using JDK
        String jdk = "1";
        while(iterator.hasNext()) {
            jdk = iterator.next();
        }
        String guava = Iterables.getLast(iterable, "1"); // using guava
        String apache = CollectionUtils.get(collection, collection.size()-1);  // using Apache
        String gs = orderedIterable.getLast(); // using GS
        String stream = collection.stream().skip(collection.size()-1).findFirst().orElse("1"); // using Stream API
        System.out.println("last = " + jdk + ":" + guava + ":" + apache + ":" + gs + ":" + stream); // print last = a8:a8:a8:a8:a8
    }

    // get a element, if collection has only one element
    private static void testGetSingle() {
        Collection<String> collection = Lists.newArrayList("a3");
        OrderedIterable<String> orderedIterable = FastList.newListWith("a3");
        Iterable<String> iterable = collection;

        // get a element, if collection has only one element
        String guava = Iterables.getOnlyElement(iterable); // using guava
        String jdk = collection.iterator().next(); // using JDK
        String apache = CollectionUtils.extractSingleton(collection); // using Apache
        assert(orderedIterable.size() != 1);// using GS
        String gs =  orderedIterable.getFirst();

        System.out.println("single = " + jdk + ":" + guava + ":" + apache + ":" + gs); // print single = a3:a3:a3:a3
    }

    // get max element
    private static void testGetMax() {
        Collection<String> collection = Lists.newArrayList("5", "1", "3", "8", "4");
        OrderedIterable<String> orderedIterable = FastList.newListWith("5", "1", "3", "8", "4");
        Iterable<String> iterable = collection;

        // get max element
        String jdk = Collections.max(collection); // using JDK
        String gs = orderedIterable.max(); // using GS
        String guava = Ordering.natural().max(iterable); // using guava

        System.out.println("max = " + jdk + ":" + guava + ":" + gs); // print max = 8:8:8
    }

    // get min element
    private static void testGetMin() {
        Collection<String> collection = Lists.newArrayList("5", "1", "3", "8", "4");
        OrderedIterable<String> orderedIterable = FastList.newListWith("5", "1", "3", "8", "4");
        Iterable<String> iterable = collection;

        // get min element
        String jdk = Collections.min(collection); // using JDK
        String gs = orderedIterable.min(); // using GS
        String guava = Ordering.natural().min(iterable); // using guava
        System.out.println("min = " + jdk + ":" + guava + ":" + gs); // print min = 1:1:1
    }

    // find element in sorted list
    private static void testBinarySearch() {
        List<String> list = Lists.newArrayList("2", "4", "13", "31", "43");
        MutableList<String> mutableList = FastList.newListWith("2", "4","13", "31", "43");

        // find element in sorted list
        int jdk = Collections.binarySearch(list, "13");
        int guava = Ordering.natural().binarySearch(list, "13");
        int gs = mutableList.binarySearch("13");

        System.out.println("find = " + jdk + ":" + guava + ":" + gs); // print find = 2:2:2
    }

    // find element in unsorted collection
    private static void testSearch() {
        Collection<String> collection = Lists.newArrayList("2", "14", "3", "13", "43");
        MutableList<String> mutableList = FastList.newListWith("2", "14", "3", "13", "43");
        Iterable<String> iterable = collection;

        // find element in unsorted collection
        String jdk = collection.stream().filter("13"::equals).findFirst().get();
        String guava = Iterables.find(iterable, "13"::equals);
        String apache = CollectionUtils.find(iterable, "13"::equals);
        String gs = mutableList.select("13"::equals).get(0);

        System.out.println("find = " + jdk + ":" + guava + ":" + apache + ":" + gs); // print find = 13:13:13:13
    }

    // get third element
    private static void testGetByIndex() {
        Collection<String> collection = Lists.newArrayList("a1", "a2", "a3", "a1");
        MutableCollection<String> orderedIterable = FastList.newListWith("a1", "a2", "a3", "a1");
        Iterable<String> iterable = collection;

        // get third element
        String jdk = collection.stream().skip(2).findFirst().get(); // using JDK
        String guava = Iterables.get(iterable, 2); // using guava
        String apache = CollectionUtils.get(iterable, 2);  // using Apache
        System.out.println("third = " + jdk + ":" + guava + ":" + apache); // print third = a3:a3:a3
    }

    // find all elements using pattern
    private static void testSelect() {
        Collection<String> collection = Lists.newArrayList("2", "14", "3", "13", "43");
        MutableCollection<String> mutableCollection = FastList.newListWith("2", "14", "3", "13", "43");
        Iterable<String> iterable = collection;

        // find all elements using pattern
        List<String> jdk = collection.stream().filter((s) -> s.contains("1")).collect(Collectors.toList()); // using JDK
        Iterable<String>  guava = Iterables.filter(iterable, (s) -> s.contains("1")); // using guava
        Collection<String> apache = CollectionUtils.select(iterable, (s) -> s.contains("1")); // using Apache
        MutableCollection<String> gs = mutableCollection.select((s) -> s.contains("1")); // using GS

        System.out.println("select = " + jdk + ":" + guava + ":" + apache + ":" + gs); // print select = [14, 13]:[14, 13]:[14, 13]:[14, 13]
    }

    public static void main(String[] args) {
        testCount();
        testGetFirst();
        testGetLast();
        testGetSingle();
        testGetMax();
        testGetMin();
        testBinarySearch();
        testSearch();
        testGetByIndex();
        testSelect();
    }

}
