package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

public class GetChildren {
    public Content action(MainTag mainTag, String id){
        Content content=null;
        SearchHeader search=new SearchHeader();
        Header selectedHeader=search.searchById(mainTag, id);

        if(selectedHeader!=null){
            content=mainTag.mainTag.get(selectedHeader);
        }

        return content;
    }
}
