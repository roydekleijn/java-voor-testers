package filemanager;

import java.io.File;

public class FileManagerImpl implements FileManager {
    public void uploadFileToServer(File file) {
        checkDiskSpace(file.length());
        validateFileExtension(file);
        File folder = generateUniqueFolder();
        // do actual upload in folder
    }

    private void checkDiskSpace(long fileSize) {
        // implementatie
    }

    private void validateFileExtension(File file) {
        // implementatie
    }

    private File generateUniqueFolder() {
        // implementatie
        return null;
    }
}