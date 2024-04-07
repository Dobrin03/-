package menu.items;

import main_class.MainTag;
import menu.program_actions.GetSelect;

import java.util.Scanner;

public class Select implements Action {
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
