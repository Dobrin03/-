package menu.load_unload_file;

import menu.file_actions.ReadFile;
import main_class.MainTag;

import java.io.IOException;

/**
 * Клас имплементриращ MainTagState за достъп до метода за зареждане на файл в програмата.
 *
 * @see ReadFile
 * @see MainTag
 * @see MainTagState
 */
public class Open implements MainTagState {
    /**
     * Имплементира интерфейсният метод. Проверява дали броя параметри, нужни за функицята,
     * е точен и ако не е, извежда подходящо съобщение. В противен случай, програмата извлича параметрите
     * в променливи и извършва желаната функция.
     *
     * @param mainTag клас съдържащ данните на файла.
     * @param data масив от низове, съдържащи параметри за функциите на програмата.
     * @return връща клас на заредения файл или изпразва данните на класа.
     * @throws IOException иключение за работа с файлове.
     */
    @Override
    public MainTag changeState(MainTag mainTag, String[] data) throws IOException {
        if(data.length==2) {
            String name = data[1];

            ReadFile read = new ReadFile(name);
            if (read.getFile().exists()) {
                mainTag = read.action();
                System.out.println("Файлът е прочетен успешно"+'\n');
            }
            else{
                System.out.println("Този xml файл не съществува"+'\n');
            }
            return mainTag;
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
        return mainTag;
    }
}
