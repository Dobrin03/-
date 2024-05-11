package menu.program_actions;

import main_class.Content;
import main_class.MainTag;

/**
 * Клас съдържащ метод за за достъп до n-тия наследник на елемент.
 *
 * @see Content
 * @see MainTag
 * @see GetChildren
 */
public class GetChild {
    /**
     * Метод, който намира n-тия наследник на елемент. Първо извлича списък с всички атрибути на вложения
     * елемент по id. Ако не е открит списък със съответното id, резутата ще е празен. В противен случай,
     * този списък се записва в клас Content, от който обхождаме атрибутите, докато не се намери n-тия на
     * брой. Ако търсената позиция надвишава броя атрибути, връщаме празен низ.
     *
     * @param mainTag клас съдържащ данните на файла.
     * @param id низ с индентификатор на хедърения таг.
     * @param n реално число на позицията на търсения наследник.
     * @return връща низ с резултата от търсенето на n-тия наследник.
     */
    public String action(MainTag mainTag, String id, int n){
        int i=1;
        GetChildren children=new GetChildren();
        if(children.action(mainTag, id)!=null) {
            Content content = children.action(mainTag, id);

            for (String string : content.getAttributes().keySet()) {
                if (i == n) {
                    return string;
                }
                ++i;
            }
        }

        return null;
    }
}
