import java.io.File;
import java.io.IOException;

public class Question19 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hamed\\Documents\\javax\\testfile.txt");

        if (file.exists()) {
            System.out.println("File already exists.");
        } else {
            System.out.println("File does not exist. Creating it...");
            try {
                if (file.createNewFile()) {
                    System.out.println("File created successfully.");
                } else {
                    System.out.println("File could not be created.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

