package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class FileCreate {
    public File file;

    protected FileCreate(String fileName, String path){
        file=new File(path+"/"+fileName+".xml");
    }

    protected abstract void checkFile() throws IOException;
}
