## **Alternative java collections overview**
*In progress*

### 1. General overview
*In progress*

### 2. New collections types
#### 2.1 MultiSet/Bag in Guava, Apache Commons Collections and Eclipse (GS) Collections

| **Type** | **Guava** | **Apache Commons Collections** | **GS Collections** | **JDK** |
| -------------	 | 	-------------| 	-------------| -------------| 	-------------|
| Order not defined | [HashMultiset](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/collect/HashMultiset.html) | [HashBag](http://commons.apache.org/proper/commons-collections/javadocs/api-3.2.1/org/apache/commons/collections/bag/HashBag.html) | [HashBag](http://www.goldmansachs.com/gs-collections/javadoc/6.1.0/com/gs/collections/impl/bag/mutable/HashBag.html) | [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html) |
| Sorted  | [TreeMultiset](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/collect/TreeMultiset.html) | [TreeBag](http://commons.apache.org/proper/commons-collections/javadocs/api-3.2.1/org/apache/commons/collections/TreeBag.html) | [TreeBag](http://www.goldmansachs.com/gs-collections/javadoc/6.1.0/com/gs/collections/impl/bag/sorted/mutable/TreeBag.html) | [TreeMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html) |
| Insertion-order  | [LinkedHashMultiset](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/collect/LinkedHashMultiset.html) | - | - | [LinkedHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html) |
| Concurrent variant | [ConcurrentHashMultiset](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/collect/ConcurrentHashMultiset.html) | [SynchronizedBag](http://commons.apache.org/proper/commons-collections/javadocs/api-3.2.1/org/apache/commons/collections/bag/SynchronizedBag.html) | [SynchronizedBag](http://www.goldmansachs.com/gs-collections/javadoc/6.1.0/com/gs/collections/impl/bag/mutable/SynchronizedBag.html) | `Collections.synchronizedMap(HashMap<String, Integer>)` |
| Concurrent and sorted | - | [SynchronizedSortedBag](http://commons.apache.org/proper/commons-collections/javadocs/api-3.2.1/org/apache/commons/collections/bag/SynchronizedSortedBag.html) | [SynchronizedSortedBag](http://www.goldmansachs.com/gs-collections/javadoc/6.1.0/com/gs/collections/impl/bag/sorted/mutable/SynchronizedSortedBag.html) | `Collections.synchronizedSortedMap(TreeMap<String,Integer>)` |
| Immutable collection | [ImmutableMultiset](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/collect/ImmutableMultiset.html) | [UnmodifiableBag](http://commons.apache.org/proper/commons-collections/javadocs/api-3.2.1/org/apache/commons/collections/bag/UnmodifiableBag.html) | [UnmodifiableBag](http://www.goldmansachs.com/gs-collections/javadoc/6.1.0/com/gs/collections/impl/bag/mutable/UnmodifiableBag.html) | `Collections.unmodifiableMap(HashMap<String, Integer)]` |
| Immutable and sorted | [ImmutableSortedMultiset](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/collect/ImmutableSortedMultiset.html) | [UnmodifiableSortedBag](http://commons.apache.org/proper/commons-collections/javadocs/api-3.2.1/org/apache/commons/collections/bag/UnmodifiableSortedBag.html) | [UnmodifiableSortedBag](UnmodifiableSortedBag) | `Collections.unmodifiableSortedMap(TreeMap<String, Integer>`) |

##### **Examples using MultiSet/Bag**
**Task**: Parse "Hello World! Hello All! Hi World!" string to separate words and print the number of occurrences of every word using MultiSet/Bag (for example, Hello = 2, Hi =1 and so on) 

*I. Apache Collection:*

   1. [HashBag](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/apache-commons/src/ApacheHashBagTest.java) - order not defined
   2. [SynchronizedBag](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/apache-commons/src/ApacheSynchronizedBagTest.java) - concurrent and order not defined
   3. [SynchronizedSortedBag](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/apache-commons/src/ApacheSynchronizedSortedBagTest.java) - - concurrent and sorted order 
   4. [TreeBag](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/apache-commons/src/ApacheTreeBagTest.java) - sorted order

*II. GS / Eclipse Collection*

   5. [MutableBag](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/gs-eclipse/src/GsMutableBagTest.java) - order not defined
   6. [MutableSortedBag](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/gs-eclipse/src/GsMutableSortedBagTest.java) - sorted order

*III. Guava*

   7. [HashMultiset](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/guava/src/GuavaHashMultisetTest.java) - order not defined
   8. [TreeMultiset](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections//src/TreeMultisetTest.java) - sorted order
   9. [LinkedHashMultiset](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections//src/LinkedHashMultisetTest.java) - insertion order
   10. [ConcurrentHashMultiset](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections//src/ConcurrentHashMultisetTest.java) - concurrent and order not defined 
        

#### 2.2 Multimap in Guava, Apache Commons Collections and Eclipse (GS) Collections

| Key's order |  Value's order | Duplicate | Analog key | Analog value | Guava | Apache | Eclipse (GS) Collections | JDK |
| ----------  | -------------  | ----------| -----------| 	 ----------|-------| -------| -------------------------|-----|
| not defined | Insertion-order | yes | [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html) | [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html) | [ArrayListMultimap](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/collect/ArrayListMultimap.html) | `MultiValueMap` | `FastListMultimap` | `HashMap<K, ArrayList<V>>` |
| not defined | not defined | no | [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html) | [HashSet](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html) | [HashMultimap](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/collect/HashMultimap.html) | `MultiValueMap. multiValueMap( new HashMap<K, Set>(), HashSet.class);` | `UnifiedSetMultimap` | `HashMap<K, HashSet<V>>` |
| not defined | sorted | no | [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html) | [TreeSet](https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html) | `Multimaps. newMultimap( HashMap, Supplier <TreeSet>)` | `MultiValueMap.multiValueMap( new HashMap<K, Set>(), TreeSet.class)` | `TreeSortedSet- Multimap` | `HashMap<K, TreeSet<V>>` |
| Insertion-order | Insertion-order | yes | [LinkedHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html) | [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html) | [LinkedListMultimap](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/collect/LinkedListMultimap.html) | MultiValueMap. multiValueMap(new LinkedHashMap<K, List>(), ArrayList.class); | |LinkedHashMap< K, ArrayList<V>> |
| Insertion-order | Insertion-order | no | [LinkedHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html) | [LinkedHashSet](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html) | [LinkedHashMultimap](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/collect/LinkedHashMultimap.html) | `MultiValueMap. multiValueMap(new LinkedHashMap<K, Set>(), LinkedHashSet.class)` | |`LinkedHashMap<K, LinkedHashSet<V>>` |
| sorted | sorted | no | [TreeMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html) | [TreeSet](https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html) | [TreeMultimap](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/collect/TreeMultimap.html) | `MultiValueMap. multiValueMap( new TreeMap<K, Set>(),TreeSet.class)` | |`TreeMap<K, TreeSet<V>>` |


##### **Examples using Multimap**
**Task**: Parse "Hello World! Hello All! Hi World!" string to separate words and print all indexes of every word using MultiMap (for example, Hello=[0, 2], World!=[1, 5] and so on) 

*I. Apache Collection:*

   1. [MultiValueMap](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/apache-commons/src/ApacheMultiValueMapTest.java)
   1. [MultiValueMapLinked](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/apache-commons/src/ApacheMultiValueMapLinkedTest.java)
   1. [MultiValueMapTree](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/apache-commons/src/ApacheMultiValueMapTreeTest.java) 

*II. GS / Eclipse Collection*

   1. [FastListMultimap](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/gs-eclipse/src/GsFastListMultimapTest.java)
   1. [HashBagMultimap](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/gs-eclipse/src/GsHashBiMapTest.java)
   1. [TreeSortedSetMultimap](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/gs-eclipse/src/GsTreeSortedSetMultimapTest.java)
   1. [UnifiedSetMultimap](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/gs-eclipse/src/GsUnifiedSetMultimapTest.java)

*III. Guava*

   1. [HashMultiMap](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections//src/HashMultiMapTest.java)
   1. [LinkedHashMultimap](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections//src/LinkedHashMultimapTest.java)
   1. [LinkedListMultimap](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections//src/LinkedListMultimapTest.java)
   1. [TreeMultimap](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections//src/TreeMultimapTest.java)
   1. [ArrayListMultimap](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections//src/ArrayListMultimapTest.java)  


####  **2.3 Using BiMap in Guava, Apache Commons Collections and GS Collections**

##### **Examples using BiMap**
*In progress*

### 3. Compare operation with collections

#### 3.1 Create collections

###### 3.1.1 Create List
| Description | JDK | guava | gs-collections |
| -------------	 | 	-------------| 	-------------| -------------|
| Create empty list | `new ArrayList<>`() | `Lists.newArrayList()` | `FastList.newList()` |
| Create list from values | `Arrays.asList("1", "2", "3")` | `Lists.newArrayList("1", "2", "3")` | `FastList.newListWith("1", "2", "3")` |
| Create list with capacity = 100 | `new ArrayList<>(100)` | `Lists.newArrayListWithCapacity(100)` | `FastList.newList(100)` |
| Create list from any collectin | `new ArrayList<>(collection)` | `Lists.newArrayList(collection)` | `FastList.newList(collection)` |
| Create list from any Iterable | - | `Lists.newArrayList(iterable)` | `FastList.newList(iterable)` |
| Create list from Iterator | - | `Lists.newArrayList(iterator)` | - |
| Create list from array | `Arrays.asList(array)` | `Lists.newArrayList(array)` | `FastList.newListWith(array)` |
| Create list using factory | - | - | `FastList.newWithNValues(10, () -> "1")` |

**Examples:** 

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

###### 3.1.2 Create Set

| Description | JDK | guava | gs-collections |
| -------------	 | 	-------------| 	-------------| -------------|
| Create empty set | `new HashSet<>()` | `Sets.newHashSet()` | `UnifiedSet.newSet()` |
| Creatre set from values | `new HashSet<>(Arrays.asList("alpha", "beta", "gamma")`) | `Sets.newHashSet("alpha", "beta", "gamma")` | `UnifiedSet.newSetWith("alpha", "beta", "gamma")` |
| Create set from any collections | `new HashSet<>(collection)` | `Sets.newHashSet(collection)` | `UnifiedSet.newSet(collection)` |
| Create set from any Iterable | - | `Sets.newHashSet(iterable)` | `UnifiedSet.newSet(iterable)` |
| Create set from any Iterator | - | `Sets.newHashSet(iterator)` | - |
| Create set from Array | `new HashSet<>(Arrays.asList(array))` | `Sets.newHashSet(array)` | `UnifiedSet.newSetWith(array)` |

**Examples:** 

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

###### 3.1.2 Create Map

| Description | JDK | guava | gs-collections |
| -------------	 | 	-------------| 	-------------| -------------|
| Create empty map | `new HashMap<>()` | `Maps.newHashMap()` | `UnifiedMap.newMap()` |
| Create map with capacity = 130 | `new HashMap<>(130)` | `Maps.newHashMapWithExpectedSize(100)` | `UnifiedMap.newMap(130)` |
| Create map from other map | `new HashMap<>(map)` | `Maps.newHashMap(map)` | `UnifiedMap.newMap(map)` |
| Create map from keys | - | - | `UnifiedMap.newWithKeysValues("1", "a", "2", "b")` |

**Examples:** 

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

More examples: [CreateCollectionTest](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/gs-eclipse/src/CreateCollectionTest.java)


1. [CollectionCompare](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/apache-commons/src/CollectionCompareTests.java)
1. [CollectionSearch](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/apache-commons/src/CollectionSearchTests.java)
1. [JavaTransform](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/apache-commons/src/JavaTransformTest.java)