import java.io.FileReader;
import java.io.IOException;

public class Question16 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:\\Users\\hamed\\Documents\\javax\\input.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

