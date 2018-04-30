package filemanagerfout;

import java.io.File;

public class FileManager {

    public void uploadFileToServer(File file) {
        checkDiskSpace(file.length());
        validateFileExtension(file);
        File folder = generateUniqueFolder();
        // do actual upload in folder
    }

    public void checkDiskSpace(long fileSize) {
        // implementatie
    }

    public void validateFileExtension(File file) {
        // implementatie
    }

    public File generateUniqueFolder() {
        // implementatie
        return null;
    }
}
