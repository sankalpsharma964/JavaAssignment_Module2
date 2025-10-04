import java.io.*;

public class Q3_ReadConsoleWithIOStreams {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            bw.write("Enter a string: ");
            bw.flush();
            String text = br.readLine();

            bw.write("Enter an integer: ");
            bw.flush();
            String numLine = br.readLine();

            int number;
            try {
                number = Integer.parseInt(numLine.trim());
            } catch (NumberFormatException e) {
                bw.write("Invalid integer input.");
                bw.newLine();
                bw.flush();
                return;
            }

            bw.write("You entered -> String: \"" + text + "\", Integer: " + number);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
            System.exit(2);
        }
    }
}
