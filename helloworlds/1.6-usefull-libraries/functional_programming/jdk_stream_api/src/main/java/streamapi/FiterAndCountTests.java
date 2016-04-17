package streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * Fiter and Count examples of Stream Api
 *
 * Created by vedenin on 17 .10.15.
 */
public class FiterAndCountTests {
    private static void testFilterAndCount() {
        System.out.println("Test filter and count start");

        // ************ Work with strings
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");

        // Get count of this object
        long count = collection.stream().filter("a1"::equals).count();
        System.out.println("count = " + count); // print  count = 2

        // Get all element according pattern
        List<String> select = collection.stream().filter((s) -> s.contains("1")).collect(Collectors.toList());
        System.out.println("select = " + select); // print  select = [a1, a1]

        // ************ Work with objects

        // Init collection of People
        Collection<People> peoples = Arrays.asList(
                new People("Vasja", 16, Sex.MAN),
                new People("Petja", 23, Sex.MAN),
                new People("Elena", 42, Sex.WOMEN),
                new People("Ivan", 69, Sex.MAN)
        );

        // Get man from 18 to 27 years old
        List<People> militaryService = peoples.stream().filter((p)-> p.getAge() >= 18 && p.getAge() < 27
                && p.getSex() == Sex.MAN).collect(Collectors.toList());
        System.out.println("militaryService = " + militaryService); // print  militaryService = [{name='Petja', age=23, sex=MAN}]

        // Get average age from man
        double manAverageAge = peoples.stream().filter((p) -> p.getSex() == Sex.MAN).
                mapToInt(People::getAge).average().getAsDouble();
        System.out.println("manAverageAge = " + manAverageAge); // print  manAverageAge = 36.0

        // Get potential working people (>= 18 years and if women go to retirement in 55 years, and man in 60 years
        long peopleHowCanWork = peoples.stream().filter((p) -> p.getAge() >= 18).filter(
                (p) -> (p.getSex() == Sex.WOMEN && p.getAge() < 55) || (p.getSex() == Sex.MAN && p.getAge() < 60)).count();
        System.out.println("peopleHowCanWork = " + peopleHowCanWork); // print  manAverageAge = 2

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
    }

    public static void main(String[] args)  throws Exception {
        testFilterAndCount();
    }
}
