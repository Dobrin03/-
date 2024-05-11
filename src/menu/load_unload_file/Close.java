package menu.load_unload_file;

import main_class.MainTag;

import java.io.IOException;

/**
 * Клас имплементриращ MainTagState за достъп до метода за затваряне на файл в програмата.
 *
 * @see MainTag
 * @see MainTagState
 */
public class Close implements MainTagState {
    /**
     * Имплементира интерфейсният метод. Проверява дали броя параметри, нужни за функицята,
     * е точен и ако не е, извежда подходящо съобщение. В противен случай, програмата извлича параметрите
     * в променливи и извършва желаната функция.
     *
     * @param mainTag клас съдържащ данните на файла.
     * @param data масив от низове, съдържащи параметри за функциите на програмата.
     * @return връща клас на заредения файл или изпразва данните на класа.
     */
    @Override
    public MainTag changeState(MainTag mainTag, String[] data) {
        if(data.length==1) {
            System.out.println("Изпразване на данните\n");
            return null;
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
        return mainTag;
    }
}
