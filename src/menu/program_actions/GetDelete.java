package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

public class GetDelete {
    public void action(MainTag mainTag, String id, String key){
        Search search=new Search();
        Header selectedHeader=search.searchHeaderById(mainTag, id);
        Content selectedContent=null;

        if(selectedHeader!=null && mainTag.mainTag.get(selectedHeader).attributes.containsKey(key)){
            selectedContent=mainTag.mainTag.get(selectedHeader);
        }


        if(selectedContent!=null){
            selectedContent.attributes.remove(key);
            System.out.println("Премахването е успешно\n");
        }
        else {
            System.out.println("Не е открит желания атрибут\n");
        }
    }
}
