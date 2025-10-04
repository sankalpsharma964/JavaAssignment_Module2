import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q2_WriteWithFileOutputStream {
    public static void main(String[] args) {
        Path out = Paths.get("output.txt");           // created in the run working directory
        byte[] data = "Java I/O Streams Example".getBytes(StandardCharsets.UTF_8);

        try (FileOutputStream fos = new FileOutputStream(out.toFile(), false)) { // false = overwrite
            fos.write(data);
            fos.flush();
            System.out.println("Wrote " + data.length + " bytes to " + out.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(2);
        }
    }
}
