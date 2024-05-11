package menu.program_actions;

import main_class.Header;
import main_class.MainTag;

/**
 * Клас с метод за добавяне на НОВ наследник на елемент.
 *
 * @see Header
 * @see MainTag
 */
public class GetNewChild {
    /**
     * Метод за добавяне на НОВ наследник на елемент. Създаване нов клас Header с име, добавяме разширение
     * id и го вмъкваме във файла без атрибути.
     *
     * @param mainTag клас съдържащ данните на файла.
     * @param name низ с име на новия таг.
     * @param id низ с индентификатор на хедърения таг.
     */
    public void action(MainTag mainTag, String name, String id){
        Header header=new Header(name);
        header.addExtension("id", id);
        mainTag.addContent(header, null);
        System.out.println("Добавянето е успешно\n");
    }
}
