package javaslang;

import javaslang.collection.List;
import javaslang.collection.Queue;

/**
 * Hello World for CyclopsReact
 *
 * Created by vedenin on 16.04.16.
 */
public class JavaSlangCollections {
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
     * A persistent data structure does preserve the previous version of itself when being modified and is therefore effectively immutable. Fully persistent data structures allow both updates and queries on any version.
     *
     */
    private void createCollection() {
        System.out.println();
        System.out.println("createList");
        List<Integer> list1 = List.of(1, 2, 3);
        System.out.println(list1); // print List(1, 2, 3)
        List<Integer> list2 = list1.tail().prepend(0);
        System.out.println(list2); // print List(0, 2, 3)

        System.out.println();
        System.out.println("createQueue");
        Queue<Integer> queue = Queue.of(1, 2, 3)
                .enqueue(4)
                .enqueue(5);
        System.out.println(queue); // print Queue(1, 2, 3, 4, 5)
    }

    public static void main(String[] args) {
        JavaSlangCollections cls = new JavaSlangCollections();
        cls.createCollection();
    }
}
