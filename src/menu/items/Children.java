package menu.items;

import main_class.MainTag;
import menu.actions.GetChildren;

import java.util.Scanner;

public class Children implements Action {
    @Override
    public void action(MainTag mainTag){
        GetChildren getChildren=new GetChildren();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Въведете ID на елемента: ");
        String id=scanner.nextLine();
        scanner.close();

        System.out.println(getChildren.action(mainTag, id).toString());
    }
}
