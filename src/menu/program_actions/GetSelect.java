package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

public class GetSelect {
    public String action(MainTag mainTag, String id, String key){
        Search search=new Search();
        Header selectedHeader=search.searchHeaderById(mainTag, id);
        Content selectedContent=null;

        if(selectedHeader!=null && mainTag.mainTag.get(selectedHeader).attributes.containsKey(key)) {
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
