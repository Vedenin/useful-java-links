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
| not defined | Insertion-order | yes | [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html) | [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html) | `ArrayListMultimap` | `MultiValueMap` | `FastListMultimap` | `HashMap<K, ArrayList<V>>` |
| not defined | not defined | no | [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html) | [HashSet](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html) | `HashMultimap` | `MultiValueMap. multiValueMap( new HashMap<K, Set>(), HashSet.class);` | `UnifiedSetMultimap` | `HashMap<K, HashSet<V>>` |
| not defined | sorted | no | [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html) | [TreeSet](https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html) | `Multimaps. newMultimap( HashMap, Supplier <TreeSet>)` | `MultiValueMap. multiValueMap( new HashMap<K, Set>(), TreeSet.class)` | `TreeSortedSet- Multimap` | `HashMap<K, TreeSet<V>>` |
| Insertion-order | Insertion-order | yes | [LinkedHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html) | [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html) | LinkedList- Multimap | MultiValueMap. multiValueMap(new LinkedHashMap<K, List>(), ArrayList.class); | |LinkedHashMap< K, ArrayList<V>> |
| Insertion-order | Insertion-order | no | [LinkedHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html) | [LinkedHashSet](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html) | `LinkedHash- Multimap` | `MultiValueMap. multiValueMap(new LinkedHashMap<K, Set>(), LinkedHashSet.class)` | |`LinkedHashMap<K, LinkedHashSet<V>>` |
| sorted | sorted | no | [TreeMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html) | [TreeSet](https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html) | `TreeMultima` | `MultiValueMap. multiValueMap( new TreeMap<K, Set>(),TreeSet.class)` | |`TreeMap<K, TreeSet<V>>` |


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
*In progress*

| Description | JDK | guava | gs-collections |
| -------------	 | 	-------------| 	-------------| -------------|
| Create empty set | `new HashSet<>()` | `Sets.newHashSet()` | `UnifiedSet.newSet()` |
| Creatre set from values | `new HashSet<>(Arrays.asList("alpha", "beta", "gamma")`) | `Sets.newHashSet("alpha", "beta", "gamma")` | `UnifiedSet.newSetWith("alpha", "beta", "gamma")` |
| Create set from any collections | `new HashSet<>(collection)` | `Sets.newHashSet(collection)` | `UnifiedSet.newSet(collection)` |
| Create set from any Iterable | - | `Sets.newHashSet(iterable)` | `UnifiedSet.newSet(iterable)` |
| Create set from any Iterator | - | `Sets.newHashSet(iterator)` | - |
| Create set from Array | `new HashSet<>(Arrays.asList(array))` | `Sets.newHashSet(array)` | `UnifiedSet.newSetWith(array)` |

**Examples:** 
*In progress*

| Description | JDK | guava | gs-collections |
| -------------	 | 	-------------| 	-------------| -------------|
| Create empty map | `new HashMap<>()` | `Maps.newHashMap()` | `UnifiedMap.newMap()` |
| Create map with capacity = 130 | `new HashMap<>(130)` | `Maps.newHashMapWithExpectedSize(100)` | `UnifiedMap.newMap(130)` |
| Create map from other map | `new HashMap<>(map)` | `Maps.newHashMap(map)` | `UnifiedMap.newMap(map)` |
| Create map from keys | - | - | `UnifiedMap.newWithKeysValues("1", "a", "2", "b")` |

**Examples:** 
*In progress*

1. [CreateCollectionTest](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/gs-eclipse/src/CreateCollectionTest.java)
1. [CollectionCompare](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/apache-commons/src/CollectionCompareTests.java)
1. [CollectionSearch](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/apache-commons/src/CollectionSearchTests.java)
1. [JavaTransform](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/1.6-usefull-libraries/collections/apache-commons/src/JavaTransformTest.java)