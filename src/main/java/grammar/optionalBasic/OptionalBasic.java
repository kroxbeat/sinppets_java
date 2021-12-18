package grammar.optionalBasic;

import java.util.Optional;

public class OptionalBasic {
    public static void main(String[] args) {
        String strNull = null;
        String strNotNull = "ABCD";

        //null 일수도 있는 것을 담을 때 좋음
        Optional<String> str1 = Optional.ofNullable(strNull);
        Optional<String> str2 = Optional.ofNullable(strNotNull);

        //꺼낼때 nullPointerException 피하기 위해 isPresent() 활용
        if (str1.isPresent()) {
            // 꺼냄
            String s = str1.get();
            System.out.println(s);
        }

        if (str2.isPresent()) {
            String s = str2.get();
            System.out.println(s);

            //만약 null이면 인자값을 가져옴
            System.out.println(str1.orElse("비어 있음"));
            //만약 null이면 인자로 전달된 람다 결과 가져옴 str1이 String 제네릭 이므로 리턴도 타입도 같아야 함
            System.out.println(str1.orElseGet(()-> s+"abc"));
        }

    }
}
