import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Files {
    private Path pathName;
    protected File file;

    protected Files( String fileName){
        file=new File("XML files/"+fileName+".xml");

    }

    protected void createFile() throws IOException {
        if(file.createNewFile()){
            System.out.println("File created successfully");
        }
        else {
            System.out.println("File already exists");
        }
    }
}
