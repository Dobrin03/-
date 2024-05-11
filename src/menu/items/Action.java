package menu.items;

import main_class.MainTag;

import java.io.IOException;

/**
 * Интерфейс, чрез който ще потребителите могат да достъпват функциите на програмата.
 *
 * @see MainTag
 */
public interface Action {
    /**
     * Метод, който събира нужните параметри и ги изпраща към съответната функция на програмата.
     *
     * @param mainTag клас съдържащ данните на файла.
     * @param data масив от низове, съдържащи параметри за функциите на програмата.
     * @param file низ съдържащ пътеката с името на файла, който ще обработваме.
     * @throws IOException иключение за работа с файлове.
     */
    void action(MainTag mainTag, String[] data, String file) throws IOException;
}
