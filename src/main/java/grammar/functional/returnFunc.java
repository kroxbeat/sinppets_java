package grammar.functional;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.IntStream;

public class returnFunc {
    static Function<String,Function<String,String>> func = message -> name -> message+", "+name;

    static BiFunction<Integer,Integer,Integer> add = ( x, y) -> x + y;
    static BiFunction<BiFunction<Integer,Integer,Integer>,Integer,Function<Integer,Integer>> curry = (f, i) -> j -> f.apply(i,j);

    public static void main(String[] args) {
        Function<String,String> korean = func.apply("안녕 ");
        Function<String,String> english = func.apply("Hi ");

        System.out.println(korean.apply(" 자바"));
        System.out.println(english.apply(" Java"));


        Function<Integer, Integer> apply = curry.apply(add, 10);

        System.out.println(apply.apply(50));
        System.out.println(apply.apply(60));

    }
}
