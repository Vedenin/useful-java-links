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
| Concurrent variant | [ConcurrentHashMultiset](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/collect/ConcurrentHashMultiset.html) | [SynchronizedBag](http://commons.apache.org/proper/commons-collections/javadocs/api-3.2.1/org/apache/commons/collections/bag/SynchronizedBag.html) | [SynchronizedBag](http://www.goldmansachs.com/gs-collections/javadoc/6.1.0/com/gs/collections/impl/bag/mutable/SynchronizedBag.html) | [Collections.synchronizedMap(HashMap<string, integer="">)</string,>](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html) |
| Concurrent and sorted | - | [SynchronizedSortedBag](http://commons.apache.org/proper/commons-collections/javadocs/api-3.2.1/org/apache/commons/collections/bag/SynchronizedSortedBag.html) | [SynchronizedSortedBag](http://www.goldmansachs.com/gs-collections/javadoc/6.1.0/com/gs/collections/impl/bag/sorted/mutable/SynchronizedSortedBag.html) | [Collections.synchronizedSortedMap(TreeMap<string ,="" integer="">)</string>](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html) |
| Immutable collection | [ImmutableMultiset](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/collect/ImmutableMultiset.html) | [UnmodifiableBag](http://commons.apache.org/proper/commons-collections/javadocs/api-3.2.1/org/apache/commons/collections/bag/UnmodifiableBag.html) | [UnmodifiableBag](http://www.goldmansachs.com/gs-collections/javadoc/6.1.0/com/gs/collections/impl/bag/mutable/UnmodifiableBag.html) | [Collections.unmodifiableMap(HashMap<string, integer="">)</string,>](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html) |
| Immutable and sorted | [ImmutableSortedMultiset](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/collect/ImmutableSortedMultiset.html) | [UnmodifiableSortedBag](http://commons.apache.org/proper/commons-collections/javadocs/api-3.2.1/org/apache/commons/collections/bag/UnmodifiableSortedBag.html) | [UnmodifiableSortedBag](UnmodifiableSortedBag) | [Collections.unmodifiableSortedMap(TreeMap<string, integer="">)</string,>](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html) |

##### **Examples using MultiSet/Bag**
*In progress*
        

#### 2.2 Multimap in Guava, Apache Commons Collections and Eclipse (GS) Collections

| Key's order |  Value's order | Duplicate | Analog key | Analog value | Guava | Apache | Eclipse (GS) Collections | JDK |
| ----------  | -------------  | ----------| -----------| 	 ----------|-------| -------| -------------------------|-----|
| not defined | Insertion-order | yes | `HashMap` | `ArrayList` | `ArrayListMultimap` | `MultiValueMap` | `FastListMultimap` | `HashMap<K, ArrayList<V>>` |
| not defined | not defined | no | `HashMap` | `HashSet` | `HashMultimap` | `MultiValueMap. multiValueMap( new HashMap<K, Set>(), HashSet.class);` | `UnifiedSetMultimap` | `HashMap<K, HashSet<V>>` |
| not defined | sorted | no | `HashMap` | `TreeSet` | `Multimaps. newMultimap( HashMap, Supplier <TreeSet>)` | `MultiValueMap. multiValueMap( new HashMap<K, Set>(), TreeSet.class)` | `TreeSortedSet- Multimap` | `HashMap<K, TreeSet<V>>` |
| Insertion-order | Insertion-order | yes | Linked HashMap | ArrayList | LinkedList- Multimap | MultiValueMap. multiValueMap(new LinkedHashMap<K, List>(), ArrayList.class); | |LinkedHashMap< K, ArrayList<V>> |
| Insertion-order | Insertion-order | no | `LinkedHash- Multimap` | `Linked- HashSet` | `LinkedHash- Multimap` | `MultiValueMap. multiValueMap(new LinkedHashMap<K, Set>(), LinkedHashSet.class)` | |`LinkedHashMap<K, LinkedHashSet<V>>` |
| sorted | sorted | no | `TreeMap` | `TreeSet` | `TreeMultima` | `MultiValueMap. multiValueMap( new TreeMap<K, Set>(),TreeSet.class)` | |`TreeMap<K, TreeSet<V>>` |


##### **Examples using Multimap**
*In progress*

####  **2.3 Using BiMap in Guava, Apache Commons Collections and GS Collections**

##### **Examples using BiMap**
*In progress*

### 3. Compare operation with collections

#### 3.1 Create collections

| Description | JDK | guava | gs-collections |
| -------------	 | 	-------------| 	-------------| -------------|
| Create empty list | new ArrayList<>() | Lists.newArrayList() | FastList.newList() |
| Create list from values | Arrays.asList("1", "2", "3") | Lists.newArrayList("1", "2", "3") | FastList.newListWith("1", "2", "3") |
| Create list with capacity = 100 | new ArrayList<>(100) | Lists.newArrayListWithCapacity(100) | FastList.newList(100) |
| Create list from any collectin | new ArrayList<>(collection) | Lists.newArrayList(collection) | FastList.newList(collection) |
| Create list from any Iterable | - | Lists.newArrayList(iterable) | FastList.newList(iterable) |
| Create list from Iterator | - | Lists.newArrayList(iterator) | - |
| Create list from array | Arrays.asList(array) | Lists.newArrayList(array) | FastList.newListWith(array) |
| Create list using factory | - | - | FastList.newWithNValues(10, () -> "1") |

**Examples:** 
*In progress*

| Description | JDK | guava | gs-collections |
| -------------	 | 	-------------| 	-------------| -------------|
| Create empty set | new HashSet<>() | Sets.newHashSet() | UnifiedSet.newSet() |
| Creatre set from values | new HashSet<>(Arrays.asList("alpha", "beta", "gamma")) | Sets.newHashSet("alpha", "beta", "gamma") | UnifiedSet.newSetWith("alpha", "beta", "gamma") |
| Create set from any collections | new HashSet<>(collection) | Sets.newHashSet(collection) | UnifiedSet.newSet(collection) |
| Create set from any Iterable | - | Sets.newHashSet(iterable) | UnifiedSet.newSet(iterable) |
| Create set from any Iterator | - | Sets.newHashSet(iterator); | - |
| Create set from Array | new HashSet<>(Arrays.asList(array)) | Sets.newHashSet(array) | UnifiedSet.newSetWith(array) |

**Examples:** 
*In progress*

| Description | JDK | guava | gs-collections |
| -------------	 | 	-------------| 	-------------| -------------|
| Create empty map | new HashMap<>() | Maps.newHashMap() | UnifiedMap.newMap() |
| Create map with capacity = 130 | new HashMap<>(130) | Maps.newHashMapWithExpectedSize(100) | UnifiedMap.newMap(130) |
| Create map from other map | new HashMap<>(map) | Maps.newHashMap(map) | UnifiedMap.newMap(map) |
| Create map from keys | - | - | UnifiedMap.newWithKeysValues("1", "a", "2", "b") |

**Examples:** 
*In progress*

