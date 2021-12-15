package designPattern.factory;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void speak() {
        System.out.println("bark");
    }
}
