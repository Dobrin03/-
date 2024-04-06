package menu.items;

import main_class.MainTag;
import menu.program_actions.GetChildren;

import java.util.Scanner;

public class Children implements Action {
    @Override
    public void action(MainTag mainTag, Scanner scanner){
        GetChildren getChildren=new GetChildren();
        System.out.println("Въведете ID на елемента: ");
        String id=scanner.nextLine();

        System.out.println(getChildren.action(mainTag, id).toString());
    }
}
