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
        String[] split;
        String fileName = null;

        do{
            System.out.println("Insert a command");

            command=scanner.nextLine();
            if((command.contains("open") || command.contains("saveas")) && command.contains(" ")){
                split=command.split(" ", 2);
                fileName=split[1];
            }
            else {
                split = command.split(" ");
            }

            if(loadUnloadMenu.mainTagState.containsKey(split[0])){
                mainTag=loadUnloadMenu.executeAction(mainTag, split);
            }
            else if(menuMap.menuMap.containsKey(split[0])){
                menuMap.executeAction(mainTag, split, fileName);
            }
            else{
                System.out.println("Не съществува такава команда. Напишете 'help' за да разгледате достъпните команди"+'\n');
            }
        }while (command.compareToIgnoreCase("exit")!=0);
        scanner.close();
    }
}