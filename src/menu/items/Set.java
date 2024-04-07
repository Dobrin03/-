package menu.items;

import main_class.MainTag;
import menu.program_actions.GetSet;

import java.util.Scanner;

public class Set implements Action {
    @Override
    public void action(MainTag mainTag, String[] data, String file){
        if(data.length==4) {
            GetSet getSet=new GetSet();
            String id=data[1];
            String key=data[2];
            String value=data[3];

            getSet.action(mainTag, id, key, value);
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
