package menu.items;

import main_class.MainTag;
import menu.program_actions.GetText;

import java.util.Scanner;

public class Text implements Action {
    @Override
    public void action(MainTag mainTag, Scanner scanner){
        GetText getText=new GetText();
        System.out.println("Въведете ID на елемента: ");
        String id=scanner.nextLine();

        System.out.println(getText.action(mainTag, id));
    }
}
