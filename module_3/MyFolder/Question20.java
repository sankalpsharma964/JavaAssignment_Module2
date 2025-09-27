import java.io.File;
import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {

        String directoryPath = "C:\\Users\\hamed\\Documents\\javax"; // Hardcoded for this example

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Files and directories in: " + directoryPath);
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("The specified path is not a valid directory.");
        }
    }
}
