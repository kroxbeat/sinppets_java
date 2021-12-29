package grammar.stringBuffer;

public class SbVsStringTimeAttack {

/*    String        :  문자열 연산이 적고 멀티쓰레드 환경일 경우
    StringBuffer    :  문자열 연산이 많고 멀티쓰레드 환경일 경우
    StringBuilder   :  문자열 연산이 많고 단일쓰레드이거나 동기화를 고려하지 않아도 되는 경우*/


    public static void main(String[] args) {
        long stTime = System.currentTimeMillis();

        String str = "";
        //StringBuffer sb = new StringBuffer("");
        StringBuilder sl = new StringBuilder("");

        for (int i = 0; i < 100000; i++) {
            //str += "*";
            //sb.append("*");
            sl.append("*");
        }

        long endTime = System.currentTimeMillis();
        System.out.println(str);
        //System.out.println(sb.toString());
        System.out.println(sl.toString());
        System.out.println(endTime - stTime);
    }

}
