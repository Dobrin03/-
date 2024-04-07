package menu.program_actions;

import main_class.Header;
import main_class.MainTag;

public class GetNewChild {
    public void action(MainTag mainTag, String name, String id){
        Header header=new Header(name, id);
        mainTag.addContent(header, null);
        System.out.println("Добавянето е успешно\n");
    }
}
