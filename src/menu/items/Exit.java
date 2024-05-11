package menu.items;

import main_class.MainTag;

import java.io.IOException;

/**
 * Клас имплеметиращ интерфейсът Action за достъп до метода за излизане от програмата.
 *
 * @see MainTag
 * @see Action
 */
public class Exit implements Action {
    /**
     * Имплементация на интерфейсният метод. Проверява дали броя параметри, нужни за функицята,
     * е точен и ако не е, извежда подходящо съобщение. В противен случай, програмата извлича параметрите
     * в променливи и извършва желаната функция.
     *
     * @param mainTag клас съдържащ данните на файла.
     * @param data масив от низове, съдържащи параметри за функциите на програмата.
     * @param file низ съдържащ пътеката с името на файла, който ще обработваме.
     */
    @Override
    public void action(MainTag mainTag, String[] data, String file) throws IOException {
        if(data.length==1) {
            System.out.println("Goodbye");
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
