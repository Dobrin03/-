package menu.file_actions;

import java.io.IOException;

/**
 * Клас, който наследява действията на WriteFile. Изполва се записване на данните от порграмата в отворения файл.
 */
public class SaveInSameFile extends WriteFile {
    /**
     * Конструктор на класа. При инициализация се извиква конструктора от родителския клас.
     *
     * @param fileName низ, съдържащ пътеката и името на файла.
     * @throws IOException иключение за работа с файлове.
     */
    public SaveInSameFile(String fileName) throws IOException {
        super(fileName);
    }
}
