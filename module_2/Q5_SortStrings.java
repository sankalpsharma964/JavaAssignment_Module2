import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q5_SortStrings {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many strings you want to add: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings.add(scanner.nextLine());
        }

        Collections.sort(strings, (s1, s2) -> s2.compareTo(s1));

        System.out.println("\nStrings in descending order:");
        for (String s : strings) {
            System.out.println(s);
        }

        scanner.close();
    }
}
