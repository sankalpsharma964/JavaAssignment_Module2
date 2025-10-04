import java.util.regex.*;
import java.io.*;

public class Q5_EmailValidator {
    private static final Pattern EMAIL =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter email: ");
            String s = br.readLine();
            Matcher m = EMAIL.matcher(s);
            System.out.println(m.matches() ? "Valid email" : "Invalid email");
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
            System.exit(2);
        }
    }
}
