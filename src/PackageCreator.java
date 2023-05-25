import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PackageCreator {
    public static String createPackageIfNotExisted(String name) {
        Path directory = Paths.get(name);

        if (Files.exists(directory)) {
            return directory.toString();
        }
        try {
            Files.createDirectory(directory);
        } catch (IOException e) {
            System.out.println(e);
        }
        return directory.toString();
    }
}
