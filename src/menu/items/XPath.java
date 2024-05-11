package menu.items;

import main_class.MainTag;
import menu.program_actions.GetXPath;

import java.io.IOException;

/**
 * Клас имплеметиращ интерфейсът Action за достъп до метода за изпълнение на простиXPath 2.0 заявки към даден елемент, която връща списък от XML елементи.
 *
 * @see MainTag
 * @see GetXPath
 * @see Action
 */
public class XPath implements Action{
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
        if(data.length==2){
            String command=data[1];

            GetXPath getXPath=new GetXPath();
            if(!getXPath.action(mainTag, command).isEmpty()){
                System.out.println(getXPath.action(mainTag, command));
            }
            else{
                System.out.println("Не е открит реултат за тази команда\n");
            }
        }
        else{
            System.out.println("Невалидна команда за "+data[0]+'\n');
        }
    }
}
