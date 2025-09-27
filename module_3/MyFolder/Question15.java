import java.io.FileOutputStream;
import java.io.IOException;

public class Question15 {
    public static void main(String[] args) {
        String content = "Java I/O Streams Example";
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\hamed\\Documents\\javax\\output.txt")) {
            fos.write(content.getBytes());
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

