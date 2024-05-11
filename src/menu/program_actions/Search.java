package menu.program_actions;

import main_class.Header;
import main_class.MainTag;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас съдържащ методи за търсене на данни във файл.
 *
 * @see main_class
 */
public class Search {
    /**
     * Метод за тръсене на хедърен таг по индентификатор. Обхождаме в клас MainTag, записаните от файла
     * хедърни тагове, докато не открим този, който отговаря на съответния индетификатор.
     *
     * @param mainTag клас съдържащ данните на файла.
     * @param id низ с индентификатор на хедърения таг.
     * @return резултат с тръесения клас.
     */
    public Header searchHeaderById(MainTag mainTag, String id){
        for(Header header: mainTag.getMainTag().keySet()){
            if(header.getExtension().get("id").equals(id)){
                return header;
            }
        }

        return null;
    }

    /**
     * Метод за тръсене на списък на хедърни тагове по име. Обхождаме в клас MainTag, записаните от файла
     * хедърни тагове, докато не открим тези, които отговарят на съответното име.
     *
     * @param mainTag клас съдържащ данните на файла
     * @param name име на хедърния таг
     * @return връща списък с всички хедърни тагив със съответното име
     */
    public List searchHeaderByName(MainTag mainTag, String name){
        List<Header> headers=new ArrayList<>();
        for(Header header: mainTag.getMainTag().keySet()){
            if(header.getName().equals(name)){
                headers.add(header);
            }
        }

        return headers;
    }

    /**
     * Метод за тръсене на атрибут в хедърен таг по съответен индентификатор. Използвайки функцията
     * searchByHeaderId(), намираме съответния хедърен таг. Ако съществува такъв във файла, извеждаме
     * атрибута, който тъсим.
     *
     * @param mainTag клас съдържащ данните на файла
     * @param name име на хедърния таг
     * @param id низ с индентификатор на хедърения таг
     * @param attribute низ с ключа на търсения атрибут
     * @return връща низ с резултат от търсенето на атрибута
     */
    public String searchForAttributeById(MainTag mainTag, String name, String id, String attribute){
        StringBuilder builder=new StringBuilder();
        Header header=searchHeaderById(mainTag, id);

        if(mainTag.getMainTag().get(header)!=null) {
            if (header != null && header.getName().equals(name) && mainTag.getMainTag().get(header).getAttributes().containsKey(attribute)) {
                builder.append(mainTag.getMainTag().get(header).getAttributes().get(attribute));
            }
        }

        return builder.toString();
    }

    /**
     * Метод за търсене на атрибути по съответен ключ. Чрез функцията searchHeaderByName(), намираме лист
     * от клас Header със съответното име. Ако съществува такъв, търсим и извеждаме списък с всички атрибути
     * по съответния ключ.
     *
     * @param mainTag клас съдържащ данните на файла
     * @param name низ с име на хедърния таг
     * @param attribute низ с ключа на търсения атрибут
     * @return връща лист с резултат от търсените атрибути
     */
    public String searchForAttributeList(MainTag mainTag, String name, String attribute){
        StringBuilder builder=new StringBuilder();
        List<Header> headers=searchHeaderByName(mainTag, name);

        for (Header header: headers) {
            if(mainTag.getMainTag().get(header)!=null) {
                if (mainTag.getMainTag().get(header).getAttributes().containsKey(attribute)) {
                    builder.append(mainTag.getMainTag().get(header).getAttributes().get(attribute)).append('\n');
                }
            }
        }

        return builder.toString();
    }

    /**
     * Метод за тръсене на разширение на хедърен таг. Чрез функцията searchHeaderByName, търсим списък от
     * клас Header по съответното име. Ако съществува такъв във файла, търсим и извеждаме списък с всички
     * разширения в спистка.
     *
     * @param mainTag клас съдържащ данните на файла
     * @param name низ с име на хедърния таг
     * @param extension разширение на хедърен таг
     * @return връща низ с резултата от търсенето на разширение
     */
    public String searchForExtensionList(MainTag mainTag, String name, String extension){
        StringBuilder builder=new StringBuilder();
        List<Header> headers=searchHeaderByName(mainTag, name);

        for (Header header: headers) {
            if(header.getExtension().containsKey(extension)) {
                builder.append(header.getExtension().get(extension)).append('\n');
            }
        }

        return builder.toString();
    }

    /**
     * Метод за търсене на стойност на атрибут по уникално име на друг атрибут в същия хедърен таг.
     * С помощта на функцията searchHeaderByName(), намираме списък от клас Header по съответното име.
     * Ако съществува такъв, търсим дали списъка съдържа уникалния и търсения атрибут. Ако и двете са във
     * хедърния таг, проверяваме и извеждаме стойността на търсения атрибутя спрямо стойността на уникалния.
     *
     * @param mainTag клас съдържащ данните на файла
     * @param name низ с име на хедърния таг
     * @param search низ с ключ на уникалния атрибут
     * @param value низ със стойност на уникалния ключ
     * @param find низ с търсена стойност на атрибут
     * @return низ с резултат от търсената стойност на атрибут
     */
    public String searchForAttributeListByUniqueAttribute(MainTag mainTag, String name, String search, String value, String find){
        StringBuilder builder=new StringBuilder();
        List<Header> headers=searchHeaderByName(mainTag, name);

        for (Header header: headers) {
            if(mainTag.getMainTag().get(header)!=null) {
                if (mainTag.getMainTag().get(header).getAttributes().containsKey(search)
                        && mainTag.getMainTag().get(header).getAttributes().containsKey(find)) {
                    if (mainTag.getMainTag().get(header).getAttributes().get(search).equals(value)) {
                        builder.append(mainTag.getMainTag().get(header).getAttributes().get(find)).append('\n');
                    }
                }
            }
        }

        return builder.toString();
    }
}
