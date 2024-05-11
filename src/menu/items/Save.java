package menu.items;

import main_class.MainTag;
import menu.file_actions.SaveInSameFile;

import java.io.IOException;
import java.nio.file.Files;

/**
 * Клас имплеметиращ интерфейсът Action за достъп до метода за записване на данните в отворения файл.
 *
 * @see MainTag
 * @see SaveInSameFile
 * @see Action
 */
public class Save implements Action{
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
        if(data.length==1){
            SaveInSameFile save=new SaveInSameFile(file);

            if(Files.exists(save.getPathName())) {
                save.action(mainTag.toString());
            }
            else {
                System.out.println("Тази пътека не съществува\n");
            }
        }else {
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
