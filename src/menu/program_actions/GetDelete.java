package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

/**
 * Клас, съдържащ метод за изтриване на атрибут на елемент по ключ.
 *
 * @see main_class
 * @see Search
 */

public class GetDelete {
    /**
     * Метод за изтриване на атрибут на елемент по ключ. Чрез функциите на клас Search, намираме хедърния
     * таг със съответното id. Ако има такъв таг, запазваме в клас Content атрибутите, намираме желания
     * атрибут и го изтриваме от файла. Ако не е открит, извеждаме подходящо съобщение.
     *
     * @param mainTag клас съдържащ данните на файла.
     * @param id низ с индентификатор на хедърения таг.
     * @param key низ с ключа на атрибута.
     */
    public void action(MainTag mainTag, String id, String key){
        Search search=new Search();
        Header selectedHeader=search.searchHeaderById(mainTag, id);
        Content selectedContent=null;

        if(selectedHeader!=null && mainTag.getMainTag().get(selectedHeader).getAttributes().containsKey(key)){
            selectedContent=mainTag.getMainTag().get(selectedHeader);
        }


        if(selectedContent!=null){
            selectedContent.getAttributes().remove(key);
            System.out.println("Премахването е успешно\n");
        }
        else {
            System.out.println("Не е открит желания атрибут\n");
        }
    }
}
