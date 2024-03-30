package menu.actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

public class GetDelete {
    public void action(MainTag mainTag, String id, String key){
        SearchHeader search=new SearchHeader();
        Header selectedHeader=search.searchById(mainTag, id);
        Content selectedContent=null;

        if(selectedHeader!=null){
            selectedContent=mainTag.mainTag.get(selectedHeader);
        }

        if(selectedContent!=null){
            selectedContent.attributes.remove(key);
        }
    }
}
