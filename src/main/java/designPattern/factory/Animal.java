package designPattern.factory;

abstract class Animal {
    {
        System.out.println("Animal called "+this.getClass().getName());
    }
    protected String name;
    protected int age;


    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }

    abstract void speak();

}
