package menu.items;

import main_class.MainTag;
import menu.program_actions.GetSet;

import java.util.Scanner;

public class Set implements Action {
    @Override
    public void action(MainTag mainTag, Scanner scanner){
        GetSet getSet=new GetSet();
        System.out.println("Въведете ID на елемента: ");
        String id=scanner.nextLine();

        System.out.println("Въведете ключ на атрибута: ");
        String key=scanner.nextLine();

        System.out.println("Въведете стойност на атрибута: ");
        String value=scanner.nextLine();

        getSet.action(mainTag, id, key, value);
    }
}
