package menu.actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

public class GetSelect {
    public String action(MainTag mainTag, String id, String key){
        SearchHeader search=new SearchHeader();
        Header selectedHeader=search.searchById(mainTag, id);
        Content selectedContent=null;

        if(selectedHeader!=null) {
           selectedContent = mainTag.mainTag.get(selectedHeader);
        }

        if(selectedContent!=null) {
            for (String k : selectedContent.attributes.keySet()) {
                if (k.equals(key)) {
                    return selectedContent.attributes.get(k);
                }
            }
        }

        return null;
    }
}
