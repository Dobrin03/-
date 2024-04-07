package menu.items;

import main_class.MainTag;
import menu.program_actions.GetNewChild;

import java.util.Scanner;

public class NewChild implements Action{
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
