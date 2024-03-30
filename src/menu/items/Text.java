package menu.items;

import main_class.MainTag;
import menu.actions.GetText;

import java.util.Scanner;

public class Text implements Action {
    @Override
    public void action(MainTag mainTag){
        GetText getText=new GetText();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Въведете ID на елемента: ");
        String id=scanner.nextLine();
        scanner.close();

        System.out.println(getText.action(mainTag, id));
    }
}
