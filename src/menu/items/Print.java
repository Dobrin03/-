package menu.items;

import main_class.MainTag;

public class Print implements Action {
    @Override
    public void action(MainTag mainTag){
        System.out.println(mainTag.toString());
    }
}
