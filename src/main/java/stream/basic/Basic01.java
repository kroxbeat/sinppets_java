package stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Basic01 {

    public static void main(String[] args) {
        List<String> listStr = Arrays.asList("b3", "a1", "a2", "a5", "a0");
        listStr.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        listStr.stream()
                .filter(Predicate.isEqual("a1"))
                .forEach(System.out::println);


        List<Integer> collect = Stream.of(new Person("k", 1), new Person("j", 2), new Person("h", 3))
                .filter(p -> p.getAge() > 1)
                .mapToInt(Person::getAge)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
