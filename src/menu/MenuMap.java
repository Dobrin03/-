package menu;

import main_class.MainTag;
import menu.items.*;

import java.util.HashMap;
import java.util.Map;

public class MenuMap {
    private Map<String, Action> menuMap = new HashMap<>();
    private Action print=new Print();
    private Action select=new Select();
    private Action set=new Set();
    private Action children=new Children();
    private Action child=new Child();
    private Action text=new Text();
    private Action delete=new Delete();
    private Action newChild=new NewChild();

    public MenuMap(){
        menuMap.put("print", print);
        menuMap.put("select", select);
        menuMap.put("set", set);
        menuMap.put("children", children);
        menuMap.put("child", child);
        menuMap.put("text", text);
        menuMap.put("delete", delete);
        menuMap.put("newchild", newChild);
    }

    public void executeAction(MainTag mainTag, String key){
        menuMap.get(key).action(mainTag);
    }
}
