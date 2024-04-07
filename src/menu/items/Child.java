package menu.items;

import main_class.MainTag;
import menu.program_actions.GetChild;

import java.util.Scanner;

public class Child implements Action {
    @Override
    public void action(MainTag mainTag, String[] data){
        if(data.length==3) {
            GetChild getChild=new GetChild();
            String id=data[1];
            int n=Integer.parseInt(data[2]);

            System.out.println(getChild.action(mainTag, id, n)+'\n');
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
