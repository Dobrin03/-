package menu.items;

import main_class.MainTag;
import menu.program_actions.GetNewChild;

import java.util.Scanner;

public class NewChild implements Action{
    @Override
    public void action(MainTag mainTag, Scanner scanner){
        GetNewChild getNewChild=new GetNewChild();
        System.out.println("Въведете ID на елемента: ");
        String id=scanner.nextLine();

        System.out.println("Въведете име на елемента: ");
        String name=scanner.nextLine();

        getNewChild.action(mainTag, name, id);
    }
}
