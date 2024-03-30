package menu.actions;

import main_class.Header;
import main_class.MainTag;

public class SearchHeader {
    public Header searchById(MainTag mainTag, String id){
        for(Header header: mainTag.mainTag.keySet()){
            if(header.id.equals(id)){
                return header;
            }
        }

        return null;
    }
}
