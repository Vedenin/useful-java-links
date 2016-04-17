package cyclopsreact;

import com.aol.cyclops.data.collections.extensions.standard.ListX;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Hello World for CyclopsReact
 *
 * Created by vedenin on 16.04.16.
 */
public class CyclopsReactHelloWorld {
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

    private void streamExample() {
        Map<Integer, List<Person>> map = Arrays.asList(new Person("Alisa", 10))
                .stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(map.get(10).get(0));
    }

    private void cyclopsExample() {
        Map<Integer, List<Person>> map =  ListX.of(new Person("Bella", 12)).groupBy(Person::getAge);
        System.out.println(map.get(12).get(0));
    }

    public static void main(String[] args) {
        CyclopsReactHelloWorld cls = new CyclopsReactHelloWorld();
        cls.streamExample();
        cls.cyclopsExample();
    }
}
