import java.io.IOException;
import java.io.RandomAccessFile;

public class Question23 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Documents\\javax\\random_access_file.txt";

        try (RandomAccessFile raf = new RandomAccessFile(filePath, "rw")) {
            // Write initial data
            raf.writeUTF("Hello World!");

            // Move the file pointer to the 7th byte (after "Hello, ")
            raf.seek(7);

            // Overwrite with "Java"
            raf.writeUTF("Java");

            // Go back to the beginning to read the content
            raf.seek(0);

            // Read the modified content
            System.out.println(raf.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
