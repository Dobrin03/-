package menu.program_actions;

import main_class.Content;
import main_class.MainTag;

public class GetChild {
    public String action(MainTag mainTag, String id, int n){
        int i=1;
        GetChildren children=new GetChildren();
        if(children.action(mainTag, id)!=null) {
            Content content = children.action(mainTag, id);

            for (String string : content.getAttributes().keySet()) {
                if (i == n) {
                    return string;
                }
                ++i;
            }
        }

        return null;
    }
}
