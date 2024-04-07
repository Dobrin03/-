package menu;

import main_class.MainTag;
import menu.items.*;
import menu.load_unload_file.Close;
import menu.load_unload_file.Open;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuMap {
    public Map<String, Action> menuMap = new HashMap<>();
    private Action save=new Save();
    private Action saveAs=new SaveAs();
    private Action help=new Help();
    private Action print=new Print();
    private Action select=new Select();
    private Action set=new Set();
    private Action children=new Children();
    private Action child=new Child();
    private Action text=new Text();
    private Action delete=new Delete();
    private Action newChild=new NewChild();
    private Action xpath=new XPath();
    private Action exit=new Exit();

    public MenuMap(){
        menuMap.put("save", save);
        menuMap.put("saveas", saveAs);
        menuMap.put("help", help);
        menuMap.put("print", print);
        menuMap.put("select", select);
        menuMap.put("set", set);
        menuMap.put("children", children);
        menuMap.put("child", child);
        menuMap.put("text", text);
        menuMap.put("delete", delete);
        menuMap.put("newchild", newChild);
        menuMap.put("xpath", xpath);
        menuMap.put("exit", exit);
    }

    public void executeAction(MainTag mainTag, String[] key, String file) throws IOException {
        if (mainTag!= null || key[0].contains("help") || key[0].contains("exit")){
            menuMap.get(key[0]).action(mainTag, key, file);
        } else {
            System.out.println("Не може да се изшълни тази команда на празен файл\n");
        }
    }
}
