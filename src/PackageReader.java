import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;

public class PackageReader {
    private static final String packageName = "/home/aghvan/IdeaProjects/FileOrganizer/src/main/java/ForProject";

    public static void readFromFileAndMove() {
        String packagePath = packageName.replace('.', '/');
        File packageDirectory = new File(packagePath);

        if (packageDirectory.exists() && packageDirectory.isDirectory()) {
            File[] files = packageDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    String fileName = file.getAbsolutePath();
                    Controller.mainProcess(fileName);
                }
            }
        }
    }
}
