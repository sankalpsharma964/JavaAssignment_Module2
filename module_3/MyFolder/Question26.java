import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question26 {
    public static void main(String[] args) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);

        String[] emails = {
                "test@example.com",
                "test.name@example.co.uk",
                "test_name@example.org",
                "test-name@example.net",
                "test+name@example.io",
                "test@.com",
                "test@com",
                "@example.com",
                "test@example."
        };

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + ": " + (matcher.matches() ? "Valid" : "Invalid"));
        }
    }
}
