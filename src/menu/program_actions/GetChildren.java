package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

public class GetChildren {
    public Content action(MainTag mainTag, String id){
        Content content=null;
        Search search=new Search();
        Header selectedHeader=search.searchHeaderById(mainTag, id);

        if(selectedHeader!=null && mainTag.getMainTag().get(selectedHeader)!=null){
            content=mainTag.getMainTag().get(selectedHeader);
        }

        return content;
    }
}
