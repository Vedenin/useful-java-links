import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.gs.collections.api.list.MutableList;
import com.gs.collections.impl.list.mutable.FastList;
import com.gs.collections.impl.map.mutable.UnifiedMap;
import com.gs.collections.impl.set.mutable.UnifiedSet;

import java.util.*;

/**
 * Create collection example
 *
 *
 * Created by vedenin on 17.10.15.
 */
public class CreateCollectionTest {
    public static void main(String[] args) {
        System.out.println("start");
        createArrayList();
        System.out.println();
        createHashSet();
        System.out.println();
        createHashMap();
        System.out.println("end");
    }

    // Create ArrayList using Gs, Guava and JDK
    private static void createArrayList() {
        System.out.println("createArrayList start");
        // Create empty list
        List<String> emptyGuava = Lists.newArrayList(); // using guava
        List<String> emptyJDK = new ArrayList<>(); // using JDK
        MutableList<String>  emptyGS = FastList.newList(); // using gs

        // Create list with 100 element
        List < String > exactly100 = Lists.newArrayListWithCapacity(100); // using guava
        List<String> exactly100JDK = new ArrayList<>(100); // using JDK
        MutableList<String>  empty100GS = FastList.newList(100); // using gs

        // Create list with about 100 element
        List<String> approx100 = Lists.newArrayListWithExpectedSize(100); // using guava
        List<String> approx100JDK = new ArrayList<>(115); // using JDK
        MutableList<String>  approx100GS = FastList.newList(115); // using gs

        // Create list with some elements
        List<String> withElements = Lists.newArrayList("alpha", "beta", "gamma"); // using guava
        List<String> withElementsJDK = Arrays.asList("alpha", "beta", "gamma"); // using JDK
        MutableList<String>  withElementsGS = FastList.newListWith("alpha", "beta", "gamma"); // using gs

        System.out.println(withElements);
        System.out.println(withElementsJDK);
        System.out.println(withElementsGS);

        // Create list from any Iterable interface (any collection)
        Collection<String> collection = new HashSet<>(3);
        collection.add("1");
        collection.add("2");
        collection.add("3");

        List<String> fromIterable = Lists.newArrayList(collection); // using guava
        List<String> fromIterableJDK = new ArrayList<>(collection); // using JDK
        MutableList<String>  fromIterableGS = FastList.newList(collection); // using gs

        System.out.println(fromIterable);
        System.out.println(fromIterableJDK);
        System.out.println(fromIterableGS);
        /* Attention: JDK create list only from Collection, but guava and gs can create list from Iterable and Collection */

        // Create list from any Iterator
        Iterator<String> iterator = collection.iterator();
        List<String> fromIterator = Lists.newArrayList(iterator); // using guava
        System.out.println(fromIterator);

        // Create list from any array
        String[] array = {"4", "5", "6"};
        List<String> fromArray = Lists.newArrayList(array); // using guava
        List<String> fromArrayJDK = Arrays.asList(array); // using JDK
        MutableList<String>  fromArrayGS = FastList.newListWith(array); // using gs
        System.out.println(fromArray);
        System.out.println(fromArrayJDK);
        System.out.println(fromArrayGS);

        // Create list using fabric
        MutableList<String>  fromFabricGS = FastList.newWithNValues(10, () -> String.valueOf(Math.random())); // using gs
        System.out.println(fromFabricGS);

        System.out.println("createArrayList end");

    }

    // Create HashSet using Guava,Gs and JDK
    private static void createHashSet() {
        System.out.println("createHashSet start");
        // Create empty set
        Set<String> emptyGuava = Sets.newHashSet(); // using guava
        Set<String> emptyJDK = new HashSet<>(); // using JDK
        Set<String> emptyGS = UnifiedSet.newSet(); // using gs

        // Create set with 100 element
        Set<String> approx100 = Sets.newHashSetWithExpectedSize(100); // using guava
        Set<String> approx100JDK = new HashSet<>(130); // using JDK
        Set<String> approx100GS = UnifiedSet.newSet(130); // using gs

        // Create set from some elements
        Set<String> withElements =  Sets.newHashSet("alpha", "beta", "gamma"); // using guava
        Set<String> withElementsJDK = new HashSet<>(Arrays.asList("alpha", "beta", "gamma")); // using JDK
        Set<String> withElementsGS  = UnifiedSet.newSetWith("alpha", "beta", "gamma"); // using gs

        System.out.println(withElements);
        System.out.println(withElementsJDK);
        System.out.println(withElementsGS);

        // Create set from any Iterable interface (any collection)
        Collection<String> collection = new ArrayList<>(3);
        collection.add("1");
        collection.add("2");
        collection.add("3");

        Set<String> fromIterable = Sets.newHashSet(collection); // using guava
        Set<String> fromIterableJDK = new HashSet<>(collection); // using JDK
        Set<String> fromIterableGS  = UnifiedSet.newSet(collection); // using gs

        System.out.println(fromIterable);
        System.out.println(fromIterableJDK);
        System.out.println(fromIterableGS);
        /* Attention: JDK create set only from Collection, but guava and gs can create set from Iterable and Collection */

        // Create set from any Iterator
        Iterator<String> iterator = collection.iterator();
        Set<String> fromIterator = Sets.newHashSet(iterator); // using guava
        System.out.println(fromIterator);

        // Create set from any array
        String[] array = {"4", "5", "6"};
        Set<String> fromArray = Sets.newHashSet(array); // using guava
        Set<String> fromArrayJDK = new HashSet<>(Arrays.asList(array)); // using JDK
        Set<String> fromArrayGS  = UnifiedSet.newSetWith(array); // using gs
        System.out.println(fromArray);
        System.out.println(fromArrayJDK);
        System.out.println(fromArrayGS);

        System.out.println("createHashSet end");
    }

    // Create HashMap using Guava,Gs and JDK
    private static void createHashMap() {
        System.out.println("createHashMap start");
        // Create empty map
        Map<String, String> emptyGuava = Maps.newHashMap(); // using guava
        Map<String, String> emptyJDK = new HashMap<>(); // using JDK
        Map<String, String> emptyGS = UnifiedMap.newMap(); // using gs

        // Create map with about 100 element
        Map<String, String> approx100 = Maps.newHashMapWithExpectedSize(100); // using guava
        Map<String, String> approx100JDK = new HashMap<>(130); // using JDK
        Map<String, String> approx100GS = UnifiedMap.newMap(130); // using gs

        // Create map from another map
        Map<String, String> map = new HashMap<>(3);
        map.put("k1","v1");
        map.put("k2","v2");
        Map<String, String> withMap =  Maps.newHashMap(map); // using guava
        Map<String, String> withMapJDK = new HashMap<>(map); // using JDK
        Map<String, String> withMapGS = UnifiedMap.newMap(map); // using gs

        System.out.println(withMap);
        System.out.println(withMapJDK);
        System.out.println(withMapGS);

        // Create map from keys
        Map<String, String> withKeys =  UnifiedMap.newWithKeysValues("1", "a", "2", "b");
        System.out.println(withKeys);

        System.out.println("createHashMap end");
    }
}
