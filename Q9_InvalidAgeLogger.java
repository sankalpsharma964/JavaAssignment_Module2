
import java.util.Scanner;
import java.util.logging.*;

public class Q9_InvalidAgeLogger {
    private static final Logger logger = Logger.getLogger(Q9_InvalidAgeLogger.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("error_log.txt", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false);
        } catch (Exception e) {
            System.out.println("Failed to set up logger: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18 to proceed.");
        } else {
            System.out.println("Access granted. You are eligible!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
            logger.severe("InvalidAgeException: " + e.getMessage());
        }
        sc.close();
    }
}
