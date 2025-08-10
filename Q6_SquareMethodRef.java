import java.util.Scanner;
import java.util.function.Function;

public class Q6_SquareMethodRef {

    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Function<Integer, Integer> squareFunction = Q6_SquareMethodRef::square;

        int result = squareFunction.apply(num);
        System.out.println("Square of " + num + " is: " + result);

        sc.close();
    }
}
