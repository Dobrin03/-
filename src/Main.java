import files.ReadFile;
import main_class.MainTag;
import menu.LoadUnloadMenu;
import menu.MenuMap;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        MenuMap menuMap=new MenuMap();
        LoadUnloadMenu loadUnloadMenu=new LoadUnloadMenu();
        MainTag mainTag = null;
        Scanner scanner=new Scanner(System.in);
        String command;
        boolean test=true;

        do{
            System.out.println("Insert a command");

            command=scanner.nextLine();
            if(loadUnloadMenu.mainTagState.containsKey(command)){
                mainTag=loadUnloadMenu.executeAction(command, scanner);
            }
            else {
                menuMap.executeAction(mainTag, command, scanner);
            }
        }while (command.compareToIgnoreCase("exit")!=0);
        scanner.close();
    }
}