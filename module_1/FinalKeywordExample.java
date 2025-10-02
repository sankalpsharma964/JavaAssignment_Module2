final class Vehicle {
    final int wheels = 4;

    final void displayType() {
        System.out.println("This is a four-wheeler vehicle.");
    }

    void showWheels() {
        System.out.println("Wheels: " + wheels);
    }
}

public class FinalKeywordExample {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.displayType();
        v.showWheels();
    }
}
