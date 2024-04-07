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
    public Map<String, MainTagState> mainTagState=new HashMap<>();
    private MainTagState open=new Open();
    private MainTagState close=new Close();

    public LoadUnloadMenu(){
        mainTagState.put("open", open);
        mainTagState.put("close", close);
    }

    public MainTag executeAction(MainTag mainTag, String[] key) throws IOException {
        mainTag=mainTagState.get(key[0]).changeState(mainTag, key);
        return mainTag;
    }
}
