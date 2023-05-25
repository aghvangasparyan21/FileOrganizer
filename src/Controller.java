public class Controller {
    public static void mainProcess(String fileType) {
        String tmp[] = FileFormatDetector.fileFormatDetector(fileType).split("/");
        FileMover.fileMover(fileType, PackageCreator.createPackageIfNotExisted(tmp[0]));
    }
}
