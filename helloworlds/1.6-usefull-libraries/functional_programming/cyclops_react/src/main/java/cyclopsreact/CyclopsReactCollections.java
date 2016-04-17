package cyclopsreact;

import com.aol.cyclops.Reducers;
import com.aol.cyclops.control.ReactiveSeq;
import com.aol.cyclops.data.collections.extensions.persistent.PStackX;
import com.aol.cyclops.data.collections.extensions.standard.ListX;
import com.aol.cyclops.data.collections.extensions.standard.SetX;
import org.pcollections.PStack;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Hello World for CyclopsReact
 *
 * Created by vedenin on 16.04.16.
 */
public class CyclopsReactCollections {
    public static class Person {
        private final int age;
        private final String name;

        public Person(String name, int age) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Hello world! My name is " + name +", and I am " + age + " years old!";
        }
    }

    /**
     * cyclops-react provides extensions for Lists, Sets, Maps, SortedSets, Queues and Deques, these are

     ListX  SetX  SortedSetX   QueueX    DequeX  MapX
     */
    private void listXExample() {
        Map<Integer, List<Person>> map =  ListX.of(new Person("Bella", 12), new Person("Alisa", 10)).groupBy(Person::getAge);
        System.out.println(map.get(12).get(0));
    }

    private void setXExample() {
        Map<Integer, List<Person>> map =  SetX.of(new Person("Bella", 12), new Person("Alisa", 10)).groupBy(Person::getAge);
        System.out.println(map.get(10).get(0));
    }

    /*
     * PCollections serves as a persistent and immutable analogue of the Java Collections Framework. This includes efficient, thread-safe, generic, immutable, and persistent stacks, maps, vectors, sets, and bags, compatible with their Java Collections counterparts.
     Persistent and immutable datatypes are increasingly appreciated as a simple, design-friendly, concurrency-friendly, and sometimes more time- and space-efficient alternative to mutable datatypes.
     */

    /** PStacks are persistent equivalents of JDK LinkedLists.     *
     */
    private void pStackCreate() {
        System.out.println();
        System.out.println("pStackCreate:");
        PStack<String> list1 = PStackX.of("a","b","c");
        System.out.println(list1); // print [a, b, c]
        PStack<String> list2 = PStackX.fromCollection(Arrays.asList("a1","b1","c1"));
        System.out.println(list2); // print [a1, b1, c1]
        List<String> empty = PStackX.empty();
        System.out.println(empty); // print []
        PStack<String> single = PStackX.singleton("1");
        System.out.println(single); // print [1]
    }

    private void pStackFromStream () {
        System.out.println();
        System.out.println("pStackFromStream:");
        PStackX<Integer> list = PStackX.fromStream(Stream.of(1,2,3)); // PStackX -  extended pCollections
        System.out.println(list); // print [3,2,1]

        PStack<String> list1 = ReactiveSeq.of("a","b","c").mapReduce(Reducers.toPStack());
        System.out.println(list1); // print [a, b, c]
    }

    public static void main(String[] args) {
        CyclopsReactCollections cls = new CyclopsReactCollections();
        cls.listXExample();
        cls.setXExample();
        cls.pStackCreate();
        cls.pStackFromStream();
    }
}
