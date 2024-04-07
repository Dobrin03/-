package menu.items;

import main_class.MainTag;
import menu.program_actions.GetText;

import java.util.Scanner;

public class Text implements Action {
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
