package streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * sort example of Stream Api
 *
 * Created by vedenin on 17 .10.15.
 */
public class SortedTests {

    private static void testSorted() {
        System.out.println();
        System.out.println("Test sorted start");

        // ************ Work with strings
        Collection<String> collection = Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4");

        // sort by alphabet
        List<String> sorted = collection.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted = " + sorted); // print  sorted = [a1, a1, a2, a3, a4, a4]

        // sort by alphabet without duplicate
        List<String> sortedDistinct = collection.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println("sortedDistinct = " + sortedDistinct); // print  sortedDistinct = [a1, a2, a3, a4]

        // sort by alphabet in reverse order
        List<String> sortedReverse = collection.stream().sorted((o1, o2) -> -o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println("sortedReverse = " + sortedReverse); // print  sortedReverse = [a4, a4, a3, a2, a1, a1]

        // sort by alphabet in reverse order without duplicate
        List<String> distinctReverse = collection.stream().sorted((o1, o2) -> -o1.compareTo(o2)).distinct().collect(Collectors.toList());
        System.out.println("distinctReverse = " + distinctReverse); // print  sortedReverse = [a4, a3, a2, a1]

        // ************ Working with objects

        // Init collection of People
        Collection<People> peoples = Arrays.asList(
                new People("Vasja", 16, Sex.MAN),
                new People("Petja", 23, Sex.MAN),
                new People("Elena", 42, Sex.WOMEN),
                new People("Ivan", 69, Sex.MAN)
        );

        // sort by alphabet by name in reverse order
        Collection<People> byName = peoples.stream().sorted((o1,o2) -> -o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
        System.out.println("byName = " + byName); // byName = [{name='Petja', age=23, sex=MAN}, {name='Ivan', age=69, sex=MAN}, {name='Elena', age=42, sex=WOMEN}, {name='Vasja', age=16, sex=MAN}]

        // sort by sex and (later) by age
        Collection<People> bySexAndAge = peoples.stream().sorted((o1, o2) -> o1.getSex() != o2.getSex() ? o1.getSex().
                compareTo(o2.getSex()) : o1.getAge().compareTo(o2.getAge())).collect(Collectors.toList());
        System.out.println("bySexAndAge = " + bySexAndAge); // bySexAndAge = [{name='Vasja', age=16, sex=MAN}, {name='Petja', age=23, sex=MAN}, {name='Ivan', age=69, sex=MAN}, {name='Elena', age=42, sex=WOMEN}]
    }

    private enum Sex {
        MAN,
        WOMEN
    }

    private static class People {
        private final String name;
        private final Integer age;
        private final Sex sex;

        public People(String name, Integer age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Sex getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof People)) return false;
            People people = (People) o;
            return Objects.equals(name, people.name) &&
                    Objects.equals(age, people.age) &&
                    Objects.equals(sex, people.sex);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, sex);
        }
    }

    public static void main(String[] args)  throws Exception {
        testSorted();
    }
}
