@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

public class Q4_FunctionalInterface {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;

        Calculator subtract = (a, b) -> a - b;

        Calculator multiply = (a, b) -> a * b;

        int x = 10, y = 5;

        System.out.println("Addition: " + add.compute(x, y));
        System.out.println("Subtraction: " + subtract.compute(x, y));
        System.out.println("Multiplication: " + multiply.compute(x, y));
    }
}
