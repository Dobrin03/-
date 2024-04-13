package menu.load_unload_file;

import main_class.MainTag;
import menu.items.Action;

import java.io.IOException;
import java.util.Scanner;

public class Close implements MainTagState {
    @Override
    public MainTag changeState(MainTag mainTag, String[] data) {
        if(data.length==1) {
            System.out.println("Изпразване на данните\n");
            return null;
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
        return mainTag;
    }
}
