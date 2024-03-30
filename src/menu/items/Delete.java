package menu.items;

import main_class.MainTag;
import menu.actions.GetDelete;

import java.util.Scanner;

public class Delete implements Action {
    @Override
    public void action(MainTag mainTag){
        GetDelete getDelete=new GetDelete();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Въведете ID на елемента: ");
        String id=scanner.nextLine();

        System.out.println("Въведете ключ на атрибута: ");
        String key=scanner.nextLine();
        scanner.close();

        getDelete.action(mainTag, id, key);
    }
}
