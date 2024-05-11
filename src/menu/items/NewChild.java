package menu.items;

import main_class.MainTag;
import menu.program_actions.GetNewChild;


/**
 * Клас имплеметиращ интерфейсът Action за достъп до метода за добавяне на НОВ наследник на елемент.
 *
 * @see MainTag
 * @see GetNewChild
 * @see Action
 */
public class NewChild implements Action{
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
    public void action(MainTag mainTag, String[] data, String file){
        if(data.length==3) {
            GetNewChild getNewChild=new GetNewChild();
            String id=data[1];
            String name=data[2];

            getNewChild.action(mainTag, id, name);
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
