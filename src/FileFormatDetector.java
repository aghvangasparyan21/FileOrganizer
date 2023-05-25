import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileFormatDetector {
    public static String fileFormatDetector(String file) {
        Path fileForDetecting = Paths.get(file);

        if (!Files.exists(fileForDetecting)) {
            System.out.println("File does not exist.");
            return null;
        }
        String contentType = "";
        try {
            contentType = Files.probeContentType(fileForDetecting);
        } catch (IOException e) {
            System.out.println(e);
        }
        return contentType;
    }
}
