package menu.items;

import main_class.MainTag;
import menu.program_actions.GetChild;

import java.util.Scanner;

public class Child implements Action {
    @Override
    public void action(MainTag mainTag, Scanner scanner){
        GetChild getChild=new GetChild();
        System.out.println("Въведете ID на елемента: ");
        String id=scanner.nextLine();

        System.out.println("Въведете номер на атрибута: ");
        int n=scanner.nextInt();

        System.out.println(getChild.action(mainTag, id, n));
    }
}
