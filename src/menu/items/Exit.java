package menu.items;

import main_class.MainTag;

import java.io.IOException;
import java.util.Scanner;

public class Exit implements Action {
    @Override
    public void action(MainTag mainTag, String[] data) throws IOException {
        if(data.length==1) {
            System.out.println("Goodbye");
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
