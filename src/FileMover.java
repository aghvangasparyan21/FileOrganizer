import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMover {
    public static void fileMover(String sourcePath, String destinationPath) {
        Path source = Paths.get(sourcePath);
        Path targetDirectory = Paths.get(destinationPath);

        if (!Files.exists((java.nio.file.Path) source)) {
            System.out.println("Source file does not exist.");
            return;
        }

        if (!Files.isDirectory(targetDirectory)) {
            System.out.println("Target path is not a directory.");
            return;
        }

        Path target = targetDirectory.resolve((source).getFileName());

        try {
            Files.move(source, target);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
