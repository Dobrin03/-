package menu.items;

import main_class.MainTag;
import menu.program_actions.GetDelete;

import java.util.Scanner;

public class Delete implements Action {
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
