
interface Creature {
    void sound();
}

class Dog1 implements Creature {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat1 implements Creature {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class InterfaceAbstraction {
    public static void main(String[] args) {
        Creature c1 = new Dog1();
        Creature c2 = new Cat1();

        c1.sound();
        c2.sound();
    }
}

