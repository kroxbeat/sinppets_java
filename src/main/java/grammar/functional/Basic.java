package grammar.functional;

import algorism.linkList.Person;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basic {
    /*
        범위 1 ~ 100 안에서 임의의 수 10 개를 담는 리스트
        숫자 리스트 를 전달받아 짝수 를 필터
        숫자 리스트 를 전달받아 일의 자리를 0 으로 만듬
     */


    //랜덤 생성
    Supplier<Integer> random = () -> (int) (Math.random() * 100) + 1;

    //짝수 필터
    Predicate<Integer> odd = (i) -> (i % 2) == 0;

    UnaryOperator<Integer> fto0 = (i) -> i/10 * 10;


    public static void main(String[] args) {
        Basic basic = new Basic();
        List<Integer> list = Stream.generate(basic.random).limit(10).collect(Collectors.toList());
        System.out.println("list = " + list);

        List<Integer> listOdd = list.stream().filter(basic.odd).collect(Collectors.toList());

        System.out.println("listOdd = " + listOdd);

        listOdd.stream().map(basic.fto0).forEach(System.out::println);


        BiFunction<String, Integer, Person> aNew = Person::new;

        Person k = aNew.apply("k", 1);
        Person j = aNew.apply("j", 2);
        Person h = aNew.apply("h", 3);

        Stream.of(k,j,h).map(Person::getName).forEach(System.out::println);



    }



}
