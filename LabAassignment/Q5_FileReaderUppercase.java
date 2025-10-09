import java.io.*;
import java.nio.file.*;

public class Q5_FileReaderUppercase {
    public static void main(String[] args) {
        Path p = (args.length > 0)
                ? Paths.get(args[0])
                : Paths.get(System.getProperty("user.home"), "Desktop", "products.txt");
        try (BufferedReader br = Files.newBufferedReader(p)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

