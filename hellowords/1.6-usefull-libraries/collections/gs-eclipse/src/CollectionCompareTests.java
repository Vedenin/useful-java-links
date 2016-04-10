import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.gs.collections.api.collection.MutableCollection;
import com.gs.collections.api.set.MutableSet;
import com.gs.collections.impl.list.mutable.FastList;
import com.gs.collections.impl.set.mutable.UnifiedSet;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Attention: version with russian comments in "rus" package
 *
 * Created by vedenin on 23.10.15.
 */
public class CollectionCompareTests {
    // Check full equals with two collections
    private static void testContainsAll() {
        Collection<String> collection1 = Lists.newArrayList("a1", "a2", "a3", "a1");
        Collection<String> collection2 = Lists.newArrayList("a1", "a2", "a3", "a1");
        Iterable<String> iterable1 = collection1;
        Iterable<String> iterable2 = collection2;
        MutableCollection<String> mutableCollection1 = FastList.newListWith("a1", "a2", "a3", "a1");
        MutableCollection<String> mutableCollection2 = FastList.newListWith("a1", "a2", "a3", "a1");

        // Check full equals with two collections
        boolean jdk =  collection1.containsAll(collection2); // using JDK
        boolean guava = Iterables.elementsEqual(iterable1, iterable2); // using guava
        boolean apache = CollectionUtils.containsAll(collection1, collection2);  // using Apache
        boolean gs = mutableCollection1.containsAll(mutableCollection2); // using GS

        System.out.println("containsAll = " + jdk + ":" + guava + ":" + apache + ":" + gs); // print containsAll = true:true:true:true
    }

    //  Check if the two collections have at least one element in common.
    private static void testContainsAny() {
        Collection<String> collection1 = Lists.newArrayList("a1", "a2", "a3", "a1");
        Collection<String> collection2 = Lists.newArrayList("a4", "a8", "a3", "a5");
        Set<String> set1 = Sets.newHashSet("a1", "a2", "a3", "a1");
        Set<String> set2 = Sets.newHashSet("a4", "a8", "a3", "a5");
        MutableSet<String> mutableSet1 = UnifiedSet.newSetWith("a1", "a2", "a3", "a1");
        MutableSet<String> mutableSet2 = UnifiedSet.newSetWith("a4", "a8", "a3", "a5");

        // Check if the two collections have at least one element in common.
        boolean jdk = !Collections.disjoint(collection1, collection2); // using JDK
        boolean guava = !Sets.intersection(set1, set2).isEmpty(); // using guava
        boolean apache = CollectionUtils.containsAny(collection1, collection2);  // using Apache
        boolean gs = !mutableSet1.intersect(mutableSet2).isEmpty(); // using GS
        System.out.println("containsAny = " + jdk + ":" + guava + ":" + apache + ":" + gs); // print containsAny = true:true:true:true
    }

    // Get all common elements in two collection
    private static void testIntersect() {
        Collection<String> collection1 = Lists.newArrayList("a1", "a2", "a3", "a1");
        Collection<String> collection2 = Lists.newArrayList("a4", "a8", "a3", "a5");
        Set<String> set1 = Sets.newHashSet("a1", "a2", "a3", "a1");
        Set<String> set2 = Sets.newHashSet("a4", "a8", "a3", "a5");
        MutableSet<String> mutableSet1 = UnifiedSet.newSetWith("a1", "a2", "a3", "a1");
        MutableSet<String> mutableSet2 = UnifiedSet.newSetWith("a4", "a8", "a3", "a5");

        // Get all common elements in two collection
        Set<String> jdk = new HashSet<>(set1); // using JDK
        jdk.retainAll(set2);
        Set<String> guava = Sets.intersection(set1, set2); // using guava
        Collection<String> apache = CollectionUtils.intersection(collection1, collection2);  // using Apache
        Set<String> gs = mutableSet1.intersect(mutableSet2); // using GS
        System.out.println("intersect = " + jdk + ":" + guava + ":" + apache + ":" + gs); // print intersect = [a3]:[a3]:[a3]:[a3]
    }

    // Find all elements that are contained by one collecion and not contained by another (difference)
    private static void testDifference() {
        Collection<String> collection1 = Lists.newArrayList("a2", "a3");
        Collection<String> collection2 = Lists.newArrayList("a8", "a3", "a5");
        Set<String> set1 = Sets.newHashSet("a2", "a3");
        Set<String> set2 = Sets.newHashSet("a8", "a3", "a5");
        MutableSet<String> mutableSet1 = UnifiedSet.newSetWith("a2", "a3");
        MutableSet<String> mutableSet2 = UnifiedSet.newSetWith("a8", "a3", "a5");

        // Find all elements that are contained by one collecion and not contained by another (difference)
        Set<String> jdk = new HashSet<>(set1); // using JDK
        jdk.removeAll(set2);
        Set<String> guava = Sets.difference(set1, set2); // using guava
        Collection<String> apache = CollectionUtils.removeAll(collection1, collection2);  // using Apache
        Set<String> gs = mutableSet1.difference(mutableSet2); // using GS
        System.out.println("difference = " + jdk + ":" + guava + ":" + apache + ":" + gs); // print difference = [a2]:[a2]:[a2]:[a2]
    }


    // Find symmetric difference (elements that are contained in either one collection or other but not in both
    private static void testSymmetricDifference() {
        Collection<String> collection1 = Lists.newArrayList("a2", "a3");
        Collection<String> collection2 = Lists.newArrayList("a8", "a3", "a5");
        Set<String> set1 = Sets.newHashSet("a2", "a3");
        Set<String> set2 = Sets.newHashSet("a8", "a3", "a5");
        MutableSet<String> mutableSet1 = UnifiedSet.newSetWith("a2", "a3");
        MutableSet<String> mutableSet2 = UnifiedSet.newSetWith("a8", "a3", "a5");

        // Find symmetric difference (elements that are contained in either one collection or other but not in both
        Set<String> intersect = new HashSet<>(set1); // using JDK
        intersect.retainAll(set2);

        Set<String> jdk = new HashSet<>(set1);
        jdk.addAll(set2);
        jdk.removeAll(intersect);

        Set<String> guava = Sets.symmetricDifference(set1, set2); // using guava
        Collection<String> apache = CollectionUtils.disjunction(collection1, collection2);  // using Apache
        Set<String> gs = mutableSet1.symmetricDifference(mutableSet2); // using GS
        System.out.println("symmetricDifference = " + jdk + ":" + guava + ":" + apache + ":" + gs); // print symmetricDifference = [a2, a5, a8]:[a2, a5, a8]:[a2, a5, a8]:[a2, a5, a8]
    }

    // Get join two collection
    private static void testUnion() {
        Set<String> set1 = Sets.newHashSet("a1", "a2");
        Set<String> set2 = Sets.newHashSet("a4");
        MutableSet<String> mutableSet1 = UnifiedSet.newSetWith("a1", "a2");
        MutableSet<String> mutableSet2 = UnifiedSet.newSetWith("a4");
        Collection<String> collection1 = set1;
        Collection<String> collection2 = set2;
        // Get join two collection
        Set<String> jdk = new HashSet<>(set1); // using JDK
        jdk.addAll(set2);
        Set<String> guava = Sets.union(set1, set2); // using guava
        Collection<String> apache = CollectionUtils.union(collection1, collection2);  // using Apache
        Set<String> gs = mutableSet1.union(mutableSet2); // using GS
        System.out.println("union = " + jdk + ":" + guava + ":" + apache + ":" + gs); // print union = [a1, a2, a4]:[a1, a2, a4]:[a1, a2, a4]:[a1, a2, a4]
    }

    public static void main(String[] args) {
        testContainsAll();
        testContainsAny();
        testIntersect();
        testDifference();
        testSymmetricDifference();
        testUnion();
    }
}
