import java.io.FileInputStream;
import java.io.IOException;

public class Question14 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\hamed\\Documents\\javax\\input.txt")) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

