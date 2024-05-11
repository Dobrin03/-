package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

/**
 * Клас, съдържащ метод за извеждане на списък с атрибути на вложените елементи.
 *
 * @see main_class
 * @see Search
 */
public class GetChildren {
    /**
     * Метод за извеждане на списък с атрибути на вложените елементи. Задаваме празен клас Content, в който
     * ще се съдържа резултата и чрез функциите от класа Search ще намерим хедърния таг, съдържащ атрибутите.
     * Ако има такъв хедърен таг във файла, ще се изведе списъка с атрибутите.
     *
     * @param mainTag клас съдържащ данните на файла.
     * @param id низ с индентификатор на хедърения таг.
     * @return връща резултата от търсения клас, съдржащ списукът от атрибути.
     */
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
