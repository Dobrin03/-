package menu.file_actions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class FileCreate {
    private File file;

    protected FileCreate(String fileName){
        file=new File(fileName+".xml");
    }

    public File getFile(){
        return file;
    }

    protected abstract void checkFile(String fileName) throws IOException;
}
