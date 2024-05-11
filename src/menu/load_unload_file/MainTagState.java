package menu.load_unload_file;

import main_class.MainTag;

import java.io.IOException;

/**
 * Интерфейс с метод за зареждане на файла в програмата.
 *
 * @see MainTag
 */
public interface MainTagState {
    /**
     * Метод, който събира нужните параметри за функциите на зареждане на файл в проеграмата.
     *
     * @param mainTag клас съдържащ данните на файла.
     * @param data масив от низове, съдържащи параметри за функциите на програмата.
     * @return връща клас на заредения файл или изпразва данните на класа.
     * @throws IOException иключение за работа с файлове.
     */
    MainTag changeState(MainTag mainTag, String[] data) throws IOException;
}
