package menu.items;

import main_class.MainTag;
import menu.actions.GetChild;

import java.util.Scanner;

public class Child implements Action {
    @Override
    public void action(MainTag mainTag){
        GetChild getChild=new GetChild();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Въведете ID на елемента: ");
        String id=scanner.nextLine();

        System.out.println("Въведете номер на атрибута: ");
        int n=scanner.nextInt();
        scanner.close();

        System.out.println(getChild.action(mainTag, id, n));
    }
}
