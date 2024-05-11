package menu.items;

import menu.file_actions.WriteFile;
import main_class.MainTag;

import java.io.IOException;
import java.nio.file.Files;

/**
 * Клас имплеметиращ интерфейсът Action за достъп до метода за записване на данните в нов файла.
 *
 * @see WriteFile
 * @see MainTag
 * @see Action
 */
public class SaveAs implements Action {
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
        if (data.length == 2) {
            String name = data[1];

            WriteFile write = new WriteFile(name);
            if (Files.exists(write.getPathName())) {
                write.action(mainTag.toString());
            }
            else {
                System.out.println("Тази пътека не съществува\n");
            }
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
