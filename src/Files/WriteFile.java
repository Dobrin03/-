package Files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile extends FileCreate {
    private FileWriter fileWriter;
    public WriteFile(String fileName) throws IOException {
        super(fileName);
        super.createFile();
        fileWriter=new FileWriter(file);
    }

    public void writeInFile(String content) throws IOException {
        fileWriter.write(content);
        fileWriter.close();
    }
}
