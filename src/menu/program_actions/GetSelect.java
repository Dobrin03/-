package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

/**
 * Клас с метод за извежда стойност на атрибут по даден идентификатор на елемента и ключ на атрибута.
 *
 * @see main_class
 * @see Search
 */
public class GetSelect {
    /**
     * Метод за извежда стойност на атрибут по даден идентификатор на елемента и ключ на атрибута. Чрез функициите
     * от клас Search, намираме клас Header със съответното id. Ако съществува такъв във файла, записваме
     * атрибутите му в клас Content и откриваме съдържание на желания атрибут.
     *
     * @param mainTag клас съдържащ данните на файла.
     * @param id низ с индентификатор на хедърения таг.
     * @param key низ с ключа на атрибута.
     * @return връща низ с резултата от търсенето на стойност на атрибут.
     */
    public String action(MainTag mainTag, String id, String key){
        Search search=new Search();
        Header selectedHeader=search.searchHeaderById(mainTag, id);
        Content selectedContent=null;

        if(selectedHeader!=null && mainTag.getMainTag().get(selectedHeader).getAttributes().containsKey(key)) {
           selectedContent = mainTag.getMainTag().get(selectedHeader);
        }

        if(selectedContent!=null) {
            for (String k : selectedContent.getAttributes().keySet()) {
                if (k.equals(key)) {
                    return selectedContent.getAttributes().get(k);
                }
            }
        }

        return null;
    }
}
