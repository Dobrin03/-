package menu;

import main_class.MainTag;
import menu.load_unload_file.Close;
import menu.load_unload_file.MainTagState;
import menu.load_unload_file.Open;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoadUnloadMenu {
    private MainTag mainTag=null;
    public Map<String, MainTagState> mainTagState=new HashMap<>();
    private MainTagState open=new Open();
    private MainTagState close=new Close();

    public LoadUnloadMenu(){
        mainTagState.put("open", open);
        mainTagState.put("close", close);
    }

    public MainTag executeAction(String key, Scanner scanner) throws IOException {
        if (mainTagState.containsKey(key)) {
            mainTag=mainTagState.get(key).changeState(scanner);
        }else {
            System.out.println("Не съществува такава команда. Напишете 'help' за да разгледате достъпните команди");
        }
        return mainTag;
    }
}
