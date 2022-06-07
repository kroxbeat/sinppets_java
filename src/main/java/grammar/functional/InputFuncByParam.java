package grammar.functional;

import java.util.function.Function;

public class InputFuncByParam {
    static Function<Integer,Integer> increase = i -> ++i;

    static int funcByParam(Function<Integer, Integer> func, int num) {
        return func.apply(num);
    }

    public static void main(String[] args) {
        int result = funcByParam(increase, 100);
        System.out.println("result = " + result);
    }
}
