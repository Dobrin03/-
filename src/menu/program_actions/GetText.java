package menu.program_actions;

import main_class.Content;
import main_class.MainTag;

/**
 * Клас с метод за достъп до текста на елемент.
 *
 * @see Content
 * @see MainTag
 * @see GetChildren
 */
public class GetText {
    /**
     * Метод за достъп до текста на елемент. Чрез функицята в класа GetChildren, намираме списък с атрибутите
     * на желания хедърен таг. Ако съществува такъв, извеждаме текста на елемент.
     *
     * @param mainTag клас съдържащ данните на файла.
     * @param id низ с индентификатор на хедърения таг.
     * @return връща низ с резултата от търсените стойности на атрибутите.
     */
    public String action(MainTag mainTag, String id){
        GetChildren getChildren=new GetChildren();
        Content selectedContent=getChildren.action(mainTag,id);
        StringBuilder builder=new StringBuilder();

        if(selectedContent!=null){
            for(String s: selectedContent.getAttributes().values()){
                builder.append(s).append(' ');
            }
            return builder.toString();
        }

        return null;
    }
}
