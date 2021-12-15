package designPattern.factory;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void speak() {
        System.out.println("cat cat meaw");
    }
}
