import java.io.FileWriter;
import java.io.IOException;

public class Question17 {
    public static void main(String[] args) {
        String content = "This is an example of writing to a file using FileWriter.";
        try (FileWriter fw = new FileWriter("C:\\Users\\hamed\\Documents\\javax\\example.txt")) {
            fw.write(content);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
