import java.io.*;
import java.nio.file.*;

public class Q1_ReadWithFileInputStream {
    public static void main(String[] args) {
        String path;
        if (args.length == 1) {
            path = args[0];
        } else {
            System.out.print("Enter file path: ");
            path = new java.util.Scanner(System.in).nextLine();
        }

        Path p = Paths.get(path);
        if (Files.isDirectory(p)) {
            System.err.println("Error: path is a directory. Provide a file, e.g. C:\\Users\\Sankalp\\OneDrive\\Desktop\\sample.txt");
            System.exit(2);
        }
        if (!Files.exists(p)) {
            System.err.println("Error: file does not exist.");
            System.exit(2);
        }
        if (!Files.isReadable(p)) {
            System.err.println("Error: file is not readable (permission/OneDrive protection?).");
            System.exit(2);
        }

        byte[] buf = new byte[8192];
        try (InputStream in = new FileInputStream(p.toFile())) {
            int n;
            while ((n = in.read(buf)) != -1) System.out.write(buf, 0, n);
            System.out.flush();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(2);
        }
    }
}
