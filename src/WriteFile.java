import java.io.FileWriter;
import java.io.IOException;

public class WriteFile extends Files{
    FileWriter fileWriter;
    protected WriteFile(String fileName) throws IOException {
        super(fileName);
        super.createFile();
        fileWriter=new FileWriter(file);
    }
}
