abstract class Vehicle2 {
    abstract void start();
}

class Car3 extends Vehicle2 {
    void start() {
        System.out.println("Car starts with key ignition.");
    }
}

public class Drive {
    public static void main(String[] args) {
        Car3 c = new Car3();
        c.start();
    }
}
