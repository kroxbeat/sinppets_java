package designPattern.factory;

public class AnimalFactory {
    public static Animal animalFactory(AnimalType animal) {
        switch (animal) {
            case Dog:
                return new Dog("k",1);
            case Cat:
                return new Cat("ccat",2);
        }
        return null;
    }

    public static void main(String[] args) {
        Animal a1 = AnimalFactory.animalFactory(AnimalType.Dog);
        a1.speak();
        Animal a2 = AnimalFactory.animalFactory(AnimalType.Cat);
        a2.speak();
    }
}
