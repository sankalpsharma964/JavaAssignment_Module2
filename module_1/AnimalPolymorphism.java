
class Animal1 {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog2 extends Animal1 {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat2 extends Animal1 {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal1 {
    @Override
    void makeSound() {
        System.out.println("Cow moos");
    }
}

public class AnimalPolymorphism {
    public static void main(String[] args) {
        Animal1 a1 = new Dog2();
        Animal1 a2 = new Cat2();
        Animal1 a3 = new Cow();

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}

