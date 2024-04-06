package files;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class WriteFile extends FileCreate {
    private FileWriter fileWriter;
    public Path pathName;

    public WriteFile(String fileName, String path) throws IOException {
        super(fileName, path);
        checkFile();
        pathName= Paths.get(path);
        if(Files.exists(pathName)) {
            fileWriter = new FileWriter(file);
        }
        else {
            System.out.println("Тази пътека не съществува");
        }
    }

    @Override
    public void checkFile() throws IOException {
        if(file.createNewFile()){
            System.out.println("Файлът е създаден успешно");
        }
        else {
            System.out.println("Файлът вече съществува. Данните са заместени успешно");
        }
    }

    public void action(String content) throws IOException {
        fileWriter.write(content);
        fileWriter.close();
    }
}
