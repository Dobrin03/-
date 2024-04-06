package menu.items;

import main_class.MainTag;

import java.util.Scanner;

public class Print implements Action {
    @Override
    public void action(MainTag mainTag, Scanner scanner){
        System.out.println(mainTag.toString());
    }
}
