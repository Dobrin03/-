package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreate {
    private Path pathName = Paths.get("XML files");
    protected File file;

    protected FileCreate(String fileName){
        file=new File(pathName+"/"+fileName+".xml");
    }

    protected void createFile() throws IOException {
        Files.createDirectories(pathName);
        if(file.createNewFile()){
            System.out.println("File created successfully");
        }
        else {
            System.out.println("File already exists");
        }
    }
}
