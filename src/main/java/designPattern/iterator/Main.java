package designPattern.iterator;

public class Main {
    public static void main(String[] args) {
        ArrContainer<String> arrc = new ArrContainer<>();
        arrc.add("AAA");
        arrc.add("ABB");
        arrc.add("BBB");

        ArrIterator<String> it = arrc.getIterator();

        while(it.hasNext()) {
            System.out.println(it.nextVal());
        }
    }

}
