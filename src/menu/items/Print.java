package menu.items;

import main_class.MainTag;

import java.util.Scanner;

public class Print implements Action {
    @Override
    public void action(MainTag mainTag, String[] data, String file){
        if(data.length==1) {
            System.out.println(mainTag.toString()+'\n');
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
