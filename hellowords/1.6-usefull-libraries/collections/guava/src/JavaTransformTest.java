

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.gs.collections.api.block.predicate.Predicate;
import com.gs.collections.api.block.procedure.Procedure;
import com.gs.collections.api.collection.MutableCollection;
import com.gs.collections.api.list.MutableList;
import com.gs.collections.impl.list.mutable.FastList;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Transform collection (sort, delete, transtorm elements and so on)
 *
 *
 *
 * Created by vvedenin on 10/27/2015.
 */
public class JavaTransformTest {

    // sorting
    private static void sortTest() {
        List<String> jdk = Lists.newArrayList("a1", "a2", "a3", "a1");
        Iterable<String> iterable = jdk;
        MutableList<String> gs = FastList.newList(jdk);

        // sorting
        Collections.sort(jdk); // using jdk
        List<String> guava = Ordering.natural().sortedCopy(iterable); // using guava
        gs.sortThis(); // using gs

        System.out.println("sort = " + jdk + ":" + guava + ":" + gs); // print sort = [a1, a1, a2, a3]:[a1, a1, a2, a3]:[a1, a1, a2, a3]
    }

    // remove if
    private static void removeTest() {
        Collection<String> jdk = Lists.newArrayList("a1", "a2", "a3", "a1");
        Iterable<String> guava = Lists.newArrayList(jdk);
        Iterable<String> apache = Lists.newArrayList(jdk);
        MutableCollection<String> gs = FastList.newList(jdk);

        // remove if
        jdk.removeIf((s) -> s.contains("1")); // using jdk
        Iterables.removeIf(guava, (s) -> s.contains("1")); // using guava
        CollectionUtils.filter(apache, (s) -> !s.contains("1")); // using apache
        gs.removeIf((Predicate<String>) (s) -> s.contains("1"));  // using gs

        System.out.println("removeIf = " + jdk + ":" + guava + ":" + apache + ":" + gs); // print removeIf = [a2, a3]:[a2, a3]:[a2, a3]:[a2, a3]
    }

    // remove if not
    private static void retainTest() {
        Collection<String> jdk = Lists.newArrayList("a1", "a2", "a3", "a1");
        Iterable<String> guava = Lists.newArrayList(jdk);
        Iterable<String> apache = Lists.newArrayList(jdk);
        MutableCollection<String> gs = FastList.newList(jdk);

        // remove if not
        jdk.removeIf((s) -> !s.contains("1")); // using jdk
        Iterables.removeIf(guava, (s) -> !s.contains("1")); // using guava
        CollectionUtils.filter(apache, (s) -> s.contains("1")); // using apache
        gs.removeIf((Predicate<String>) (s) -> !s.contains("1"));  //using gs

        System.out.println("retainIf = " + jdk + ":" + guava + ":" + apache + ":" + gs); // print retainIf = [a1, a1]:[a1, a1]:[a1, a1]:[a1, a1]
    }

    // Transform all elements
    private static void transformTest() {
        Collection<String> collection = Lists.newArrayList("a1", "a2", "a3", "a1");
        Iterable<String> iterable = collection;
        Collection<String> apache = Lists.newArrayList(collection);
        MutableCollection<String> mutableCollection = FastList.newList(collection);

        // Transform all elements
        List<String> jdk = collection.stream().map((s) -> s + "_1").collect(Collectors.toList()); // using jdk
        Iterable<String> guava = Iterables.transform(iterable, (s) -> s + "_1"); // using guava
        CollectionUtils.transform(apache, (s) -> s + "_1"); // using apache
        MutableCollection<String> gs = mutableCollection.collect((s) -> s + "_1");  // using gs
        System.out.println("transform = " + jdk + ":" + guava + ":" + apache + ":" + gs); // print transform = [a1_1, a2_1, a3_1, a1_1]:[a1_1, a2_1, a3_1, a1_1]:[a1_1, a2_1, a3_1, a1_1]:[a1_1, a2_1, a3_1, a1_1]
    }

    // Change property of all elements
    private static void changeAllTest() {
        Collection<StringBuilder> jdk = Lists.newArrayList(new StringBuilder("a1"), new StringBuilder("a2"), new StringBuilder("a3"));
        Iterable<StringBuilder> iterable = Lists.newArrayList(new StringBuilder("a1"), new StringBuilder("a2"), new StringBuilder("a3"));;
        Collection<StringBuilder> apache = Lists.newArrayList(new StringBuilder("a1"), new StringBuilder("a2"), new StringBuilder("a3"));
        MutableCollection<StringBuilder> gs = FastList.newListWith(new StringBuilder("a1"), new StringBuilder("a2"), new StringBuilder("a3"));

        // Change property of all elements
        jdk.stream().forEach((s) -> s.append("_1")); // using jdk
        Iterable<StringBuilder> guava = Iterables.transform(iterable, (s) -> s.append("_1")); // using guava
        CollectionUtils.transform(apache, (s) -> s.append("_1")); // using apache
        gs.forEach((Procedure<StringBuilder>) (s) -> s.append("_1"));  // using gs

        System.out.println("change = " + jdk + ":" + guava + ":" + apache + ":" + gs); // print changeAll = [a1_1, a2_1, a3_1]:[a1_1, a2_1, a3_1]:[a1_1, a2_1, a3_1]:[a1_1, a2_1, a3_1]
    }


    public static void main(String[] args) {
        sortTest();
        removeTest();
        retainTest();
        transformTest();
        changeAllTest();
    }
}
