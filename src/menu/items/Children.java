package menu.items;

import main_class.MainTag;
import menu.program_actions.GetChildren;

/**
 * Клас имплеметиращ интерфейсът Action за достъп до метода за извеждане на списък с атрибути на вложените елементи.
 *
 * @see MainTag
 * @see GetChildren
 * @see Action
 */
public class Children implements Action {
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
        if(data.length==2) {
            GetChildren getChildren=new GetChildren();
            String id=data[1];

            if(getChildren.action(mainTag, id)!=null) {
                System.out.println(getChildren.action(mainTag, id).toString() + '\n');
            }
            else{
                System.out.println("В този елемент няма вложени атрибути\n");
            }
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
