package menu.file_actions;

import java.io.File;
import java.io.IOException;


/**
 * Абстрактен клас, който създава файл за записване на данните след промени от програмата.
 * Съдържа абстрактен метод за проверка дали файлът е създаден успешно или вече съществува.
 */
public abstract class FileCreate {
    /**
     * file представлява, файлът, в който ще запишем новите данни.
     */
    private File file;

    /**
     * Конструктор на класа. Създава файл в посочена от потребителя пътеката с име и разширение '.xml'.
     *
     * @param fileName низ с пътеката и името на файла.
     */
    protected FileCreate(String fileName){
        file=new File(fileName+".xml");
    }

    /**
     * Метод за достъп до файла.
     *
     * @return връща променливата, съдржаща файла.
     */
    public File getFile(){
        return file;
    }

    /**
     * Абстрактен метод за проверка дали файлът е създаден успешно или вече съществува.
     *
     * @param fileName пътека с име на файла.
     * @throws IOException иключение за работа с файлове.
     */
    protected abstract void checkFile(String fileName) throws IOException;
}
