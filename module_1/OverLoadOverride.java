class Vehicle1 {

    void start() {
        System.out.println("Vehicle is starting...");
    }

    void start(String keyType) {
        System.out.println("Vehicle is starting with a " + keyType);
    }

    void fuelType() {
        System.out.println("Vehicle uses generic fuel");
    }
}

class Car extends Vehicle1 {
    @Override
    void fuelType() {
        System.out.println("Car uses petrol");
    }
}

public class OverLoadOverride {
    public static void main(String[] args) {
        Vehicle1 v = new Vehicle1();
        v.start();
        v.start("remote key");

        Vehicle1 myCar = new Car();
        myCar.fuelType();
    }
}

