package menu.file_actions;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class WriteFile extends FileCreate {
    private FileWriter fileWriter;
    private Path pathName;

    public WriteFile(String fileName) throws IOException {
        super(fileName);
        checkFile(fileName);
        if(Files.exists(pathName)) {
            fileWriter = new FileWriter(getFile());
        }
    }

    public Path getPathName(){
        return pathName;
    }

    @Override
    public void checkFile(String fileName) throws IOException {
        String path=fileName.substring(0, fileName.lastIndexOf("\\"));
        pathName=Paths.get(path);

        if(Files.exists(pathName)) {
            if (getFile().createNewFile()) {
                System.out.println("Файлът е създаден успешно\n");
            } else {
                System.out.println("Файлът вече съществува. Данните са заместени успешно\n");
            }
        }
    }

    public void action(String content) throws IOException {
        fileWriter.write(content);
        fileWriter.close();
    }
}
