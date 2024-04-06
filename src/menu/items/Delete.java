package menu.items;

import main_class.MainTag;
import menu.program_actions.GetDelete;

import java.util.Scanner;

public class Delete implements Action {
    @Override
    public void action(MainTag mainTag, Scanner scanner){
        GetDelete getDelete=new GetDelete();
        System.out.println("Въведете ID на елемента: ");
        String id=scanner.nextLine();

        System.out.println("Въведете ключ на атрибута: ");
        String key=scanner.nextLine();

        getDelete.action(mainTag, id, key);
    }
}
