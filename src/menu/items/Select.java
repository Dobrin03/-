package menu.items;

import main_class.MainTag;
import menu.actions.GetSelect;

import java.util.Scanner;

public class Select implements Action {
    @Override
    public void action(MainTag mainTag){
        GetSelect getSelect=new GetSelect();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Въведете ID на елемента: ");
        String id=scanner.nextLine();

        System.out.println("Въведете ключ на атрибута: ");
        String key=scanner.nextLine();
        scanner.close();

        System.out.println(getSelect.action(mainTag,id,key));
    }
}
