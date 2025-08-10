import java.util.Scanner;

public class Q7_TryCatchFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();

        System.out.println("\n--- Using try-catch only ---");
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        System.out.println("\n--- Using try-catch-finally ---");
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("This block always executes (cleanup code).");
        }

        sc.close();
    }
}
