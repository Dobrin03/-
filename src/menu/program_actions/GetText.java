package menu.program_actions;

import main_class.Content;
import main_class.MainTag;

public class GetText {
    public String action(MainTag mainTag, String id){
        GetChildren getChildren=new GetChildren();
        Content selectedContent=getChildren.action(mainTag,id);
        StringBuilder builder=new StringBuilder();

        if(selectedContent!=null){
            for(String s: selectedContent.attributes.values()){
                builder.append(s).append(' ');
            }
            return builder.toString();
        }

        return null;
    }
}
