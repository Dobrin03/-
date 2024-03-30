package menu.items;

import main_class.MainTag;
import menu.actions.GetSet;

import java.util.Scanner;

public class Set implements Action {
    @Override
    public void action(MainTag mainTag){
        GetSet getSet=new GetSet();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Въведете ID на елемента: ");
        String id=scanner.nextLine();

        System.out.println("Въведете ключ на атрибута: ");
        String key=scanner.nextLine();

        System.out.println("Въведете стойност на атрибута: ");
        String value=scanner.nextLine();
        scanner.close();

        getSet.action(mainTag, id, key, value);
    }
}
