package menu.items;

import main_class.MainTag;
import menu.actions.GetNewChild;

import java.util.Scanner;

public class NewChild implements Action{
    @Override
    public void action(MainTag mainTag){
        GetNewChild getNewChild=new GetNewChild();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Въведете ID на елемента: ");
        String id=scanner.nextLine();

        System.out.println("Въведете име на елемента: ");
        String name=scanner.nextLine();
        scanner.close();

        getNewChild.action(mainTag, name, id);
    }
}
