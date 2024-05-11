package menu.items;

import main_class.MainTag;
import menu.program_actions.GetChild;


/**
 * Клас имплеметиращ интерфейсът Action за достъп до метода за достъп до n-тия наследник на елемент.
 *
 * @see MainTag
 * @see GetChild
 * @see Action
 */
public class Child implements Action {
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
            GetChild getChild=new GetChild();
            String id=data[1];
            int n=Integer.parseInt(data[2]);

            if(getChild.action(mainTag, id, n)!=null) {
                System.out.println(getChild.action(mainTag, id, n) + '\n');
            }
            else{
                System.out.println("Не е открит наследника\n");
            }
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
