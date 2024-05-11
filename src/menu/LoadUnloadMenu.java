package menu;

import main_class.MainTag;
import menu.load_unload_file.Close;
import menu.load_unload_file.MainTagState;
import menu.load_unload_file.Open;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Клас, който съдържа hash map от класове с действия за зареждане на файл в програмата. Класът съхранява всички действия
 * за зареждане на файл в програмата като стойсност в hash map със съответен ключ за извикване при инициализция.
 *
 * @see MainTag
 * @see menu.load_unload_file
 */
public class LoadUnloadMenu {
    /**
     * menuMap представлява hash map, в който ще се съхранят действията за зареждане на файл в програмата.
     */
    public Map<String, MainTagState> mainTagState=new HashMap<>();
    /**
     * open представлява клас, който зарежда файл в програмата.
     */
    private MainTagState open=new Open();
    /**
     * close представлява клас, който затваря файл от програмата.
     */
    private MainTagState close=new Close();

    /**
     * Конструктор на класа.
     */
    public LoadUnloadMenu(){
        mainTagState.put("open", open);
        mainTagState.put("close", close);
    }

    /**
     * Метод за достъп до функциите за зареждане на файл в програмата.
     *
     * @param mainTag клас съдържащ данните на файла.
     * @param key масив от низове, съдържащ ключа за достъп до командата и нужните параметри.
     * @throws IOException иключение за работа с файлове.
     * @return връща клас с данните от файла или изпразва данните от файла
     */
    public MainTag executeAction(MainTag mainTag, String[] key) throws IOException {
        mainTag = mainTagState.get(key[0]).changeState(mainTag, key);
        return mainTag;
    }
}
