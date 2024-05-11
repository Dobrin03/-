package menu.items;

import main_class.MainTag;
import menu.program_actions.GetText;

/**
 * Клас имплеметиращ интерфейсът Action за достъп до метода за достъп до текста на елемент.
 *
 * @see MainTag
 * @see GetText
 * @see Action
 */
public class Text implements Action {
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
            GetText getText=new GetText();
            String id=data[1];

            if(!getText.action(mainTag, id).isEmpty()) {
                System.out.println(getText.action(mainTag, id) + "\n");
            }
            else {
                System.out.println("Не е открит текст в съответния атрибут\n");
            }
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
