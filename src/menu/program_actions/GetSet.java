package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

/**
 * Клас с метод за присвояване на стойност на атрибут.
 *
 * @see main_class
 * @see Search
 */
public class GetSet {
    /**
     * Mетод за присвояване на стойност на атрибут. Чрез функциите на клас Search намираме клас Header
     * със съответното id. Ако съществува такъв във файла, записваме в клас Content атрибутите и присвояваме
     * съответния атрибут. Ако не е намерен такъв, извеждаме подходящо съобщение.
     *
     * @param mainTag клас съдържащ данните на файла.
     * @param id низ с индентификатор на хедърения таг.
     * @param key низ с ключа на атрибута.
     * @param value низ със новата стойност на атрибута.
     */
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
