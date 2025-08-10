import java.util.Scanner;

// Custom exception for negative numbers
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Q10_Factorial {

    public static long factorial(int n) throws NegativeNumberException {
        if (n < 0) {
            // 'throw' actually throws the exception
            throw new NegativeNumberException("Factorial is not defined for negative numbers!");
        }

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int number = sc.nextInt();

        try {
            long result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
