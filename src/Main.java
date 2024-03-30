import files.ReadFile;
import main_class.MainTag;
import menu.MenuMap;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        MenuMap menuMap=new MenuMap();
        ReadFile readFile=new ReadFile("test");
        MainTag mainTag = new MainTag(null);

        readFile.read(mainTag);
        menuMap.executeAction(mainTag, "delete");
        menuMap.executeAction(mainTag, "print");
    }
}