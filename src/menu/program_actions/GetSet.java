package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

public class GetSet {
    public void action(MainTag mainTag, String id, String key, String value){
        Search search=new Search();
        Header selectedHeader=search.searchHeaderById(mainTag, id);
        Content selectedContent=null;

        if(selectedHeader!=null) {
            selectedContent = mainTag.getMainTag().get(selectedHeader);
        }

        if(selectedContent!=null){
            selectedContent.getAttributes().put(key, value);
            System.out.println("Успешно присвояване на стойност\n");
        }
        else {
            System.out.println("Не е открит желания атрибут\n");
        }
    }
}
