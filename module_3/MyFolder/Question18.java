import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question18 {
    public static void main(String[] args) {
        // Reading with BufferedReader
        System.out.println("--- Reading with BufferedReader ---");
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hamed\\Documents\\javax\\input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing with BufferedWriter
        System.out.println("\n--- Writing with BufferedWriter ---");
        String content = "This is an example of writing to a file using BufferedWriter.";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\hamed\\Documents\\javax\\buffered_example.txt"))) {
            bw.write(content);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
