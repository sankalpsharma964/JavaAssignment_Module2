import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question21 {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\Documents\\javax\\input.txt";
        String destinationFile = "C:\\Users\\Documents\\javax\\input_copy.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
