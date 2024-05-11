package menu.file_actions;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Клас наследяващ функциите на FileCreate. Служи за записване на данните във файл.
 */
public class WriteFile extends FileCreate {
    /**
     * fileWriter представлява клас с функция за записване на данни от програма във файл.
     */
    private FileWriter fileWriter;

    /**
     * pathName представлява клас с пътеката, в която се намира файла.
     */
    private Path pathName;

    /**
     * Конструктор на класа. Създава файл, в който ще записваме данни, ако той пътеката на файла съществува.
     *
     * @param fileName низ с пътеката и името на файла.
     * @throws IOException иключение за работа с файлове.
     */
    public WriteFile(String fileName) throws IOException {
        super(fileName);
        checkFile(fileName);
        if(Files.exists(pathName)) {
            fileWriter = new FileWriter(getFile());
        }
    }

    /**
     * Метод за достъп до пътеката на файла.
     *
     * @return променливата, съдържаща пътеката на файла.
     */
    public Path getPathName(){
        return pathName;
    }

    /**
     * Употреба на абстрактния метод от родителския клас. Задваме пътеката на файла като я извлечем от fileName
     * и проверяваме дали тя съществува. Ako съществува, проверяваме дали файлът е създаден успешно или
     * вече съществува.
     *
     * @param fileName пътека с име на файла
     * @throws IOException иключение за работа с файлове
     */
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

    /**
     * Метод за записване на данните във файл.
     *
     * @param content данни, които искаме да запишем
     * @throws IOException иключение за работа с файлове
     */
    public void action(String content) throws IOException {
        fileWriter.write(content);
        fileWriter.close();
    }
}
