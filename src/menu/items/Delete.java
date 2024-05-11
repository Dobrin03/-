package menu.items;

import main_class.MainTag;
import menu.program_actions.GetDelete;


/**
 * Клас имплеметиращ интерфейсът Action за достъп до метода за изтриване на атрибут на елемент по ключ.
 *
 * @see MainTag
 * @see GetDelete
 * @see Action
 */
public class Delete implements Action {
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
            GetDelete getDelete=new GetDelete();
            String id=data[1];
            String key=data[2];

            getDelete.action(mainTag, id, key);
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
