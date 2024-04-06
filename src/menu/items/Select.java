package menu.items;

import main_class.MainTag;
import menu.program_actions.GetSelect;

import java.util.Scanner;

public class Select implements Action {
    @Override
    public void action(MainTag mainTag, Scanner scanner){
        GetSelect getSelect=new GetSelect();
        System.out.println("Въведете ID на елемента: ");
        String id=scanner.nextLine();

        System.out.println("Въведете ключ на атрибута: ");
        String key=scanner.nextLine();

        System.out.println(getSelect.action(mainTag,id,key));
    }
}
