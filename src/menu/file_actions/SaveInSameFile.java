package menu.file_actions;

import files.WriteFile;
import main_class.MainTag;

import java.io.File;
import java.io.IOException;

public class SaveInSameFile extends WriteFile {
    public SaveInSameFile(String fileName, String path) throws IOException {
        super(fileName, path);
    }
}
