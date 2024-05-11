package menu.items;

import main_class.MainTag;
import menu.program_actions.GetSelect;

/**
 * Клас имплеметиращ интерфейсът Action за достъп до метода за извеждане стойност на атрибут по даден идентификатор на елемента и ключ на атрибута.
 *
 * @see MainTag
 * @see GetSelect
 * @see Action
 */
public class Select implements Action {
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
            GetSelect getSelect=new GetSelect();
            String id=data[1];
            String key=data[2];

            if (getSelect.action(mainTag, id, key)!=null) {
                System.out.println(getSelect.action(mainTag, id, key));
            }
            else {
                System.out.println("Не е открит желания атрибут\n");
            }
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
