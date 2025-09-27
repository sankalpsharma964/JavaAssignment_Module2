import java.util.ArrayList;
import java.util.Scanner;

public class Q3_ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to add: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        System.out.println("\nThe numbers you entered are:");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}
