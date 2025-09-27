public class Question24 {
    public static void main(String[] args) {
        // Math.random()
        double randomNumber = Math.random();
        System.out.println("Random number: " + randomNumber);

        // Math.abs()
        int negativeNumber = -10;
        int absoluteValue = Math.abs(negativeNumber);
        System.out.println("Absolute value of " + negativeNumber + " is: " + absoluteValue);

        // Math.pow()
        double base = 2;
        double exponent = 3;
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
