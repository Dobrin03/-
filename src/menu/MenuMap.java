package menu;

import main_class.MainTag;
import menu.items.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuMap {
    private Map<String, Action> menuMap = new HashMap<>();
    private Action open=new Open();
    private Action save=new Save();
    private Action saveAs=new SaveAs();
    private Action close=new Close();
    private Action print=new Print();
    private Action select=new Select();
    private Action set=new Set();
    private Action children=new Children();
    private Action child=new Child();
    private Action text=new Text();
    private Action delete=new Delete();
    private Action newChild=new NewChild();
    private Action exit=new Exit();

    public MenuMap(){
        menuMap.put("open", open);
        menuMap.put("save", save);
        menuMap.put("saveas", saveAs);
        menuMap.put("close", close);
        menuMap.put("print", print);
        menuMap.put("select", select);
        menuMap.put("set", set);
        menuMap.put("children", children);
        menuMap.put("child", child);
        menuMap.put("text", text);
        menuMap.put("delete", delete);
        menuMap.put("newchild", newChild);
        menuMap.put("exit", exit);
    }

    public void executeAction(MainTag mainTag, String key, Scanner scanner) throws IOException {
        if (menuMap.containsKey(key)) {
            if (mainTag.name != null || key.compareToIgnoreCase("exit")==0
                    || key.compareToIgnoreCase("open")==0) {
                menuMap.get(key).action(mainTag, scanner);
            } else {
                System.out.println("Не може да се изшълни тази команда на празен файл");
            }
        }else {
            System.out.println("Не съществува такава команда. Напишете 'help' за да разгледате достъпните команди");
        }
    }
}
