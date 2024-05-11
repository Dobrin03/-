package main_class;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Клас, съдържащ главният таг с hash map от хедърните тагове и техните атрибути.
 * Съдържа функция за проверка на разширение на хедърен таг id.
 * При промяна, те се запаметяват фроматирано във файл.
 */
public class MainTag {
    /**
     * name представлява низ с името на тага.
     */
    private String name;
    /**
     * mainTag представлява hash map с ключ от главния таг и стойност от атрибутите.
     */
    private Map<Header, Content> mainTag;

    /**
     * Конструктор на класа.
     *
     * @param name низ с името на тага.
     */
    public MainTag(String name){
        mainTag=new HashMap<>();
        this.name=name;
    }

    /**
     * Меотд за задване на име на тага.
     *
     * @param name низ с името на тага.
     */
    public void setName(String name){
        this.name=name;
    }

    /**
     * Метод за вмъкване на съдържание на тага. Преди да се добави прави проверка за разширение id на хедъра.
     *
     * @param key хедърен таг.
     * @param value атрибути.
     */
    public void addContent(Header key, Content value){
        checkForRepeatId(key, key.getExtension().get("id"), 1);
        mainTag.put(key, value);
    }

    /**
     * Метод за достъп до тага.
     *
     * @return връща променливата, съдържаща името тага.
     */
    public String getName(){
        return name;
    }

    /**
     * Метод за достъп до съдържанието.
     *
     * @return връща променливата, съдържаща съдържанието на тага.
     */
    public Map<Header, Content> getMainTag(){
        return mainTag;
    }

    /**
     * Метод за проверка на разширение id в хедърния таг с всички добавени хедърни тагове в главния файл.
     * Ако новото id е празно, програмата генерира ново спрямо броя на добавените хедърни тагове.
     * Ако новото id съвпадне с вече съществуващо, и двете се разширяват с '_1' и '_2' съответно и
     * се проверяват отново за съвпадение.
     *
     * @param key хедърен таг.
     * @param value стойност на разширение id.
     * @param i нова стойност на id.
     */
    private void checkForRepeatId(Header key, String value, int i){
        if(!key.getExtension().containsKey("id")){
            key.getExtension().put("id", String.valueOf(i));
            checkForRepeatId(key, key.getExtension().get("id"), i);
        }
        else {
        if(!mainTag.isEmpty()) {
            if(value.isEmpty()){
                for(Header header: mainTag.keySet()){
                    ++i;
                }
                key.changeID(String.valueOf(i));
            }
            else {
                List<Header> headers = mainTag.keySet().stream().filter(h -> h.getExtension().get("id").equals(value))
                        .collect(Collectors.toList());

                if (mainTag.containsKey(key)) {
                    headers.remove(key);
                }

                for (Header header : headers) {
                    header.changeID(value + "_" + i);
                    ++i;
                    checkForRepeatId(header, value, i);
                    key.changeID(value + "_" + i);
                    checkForRepeatId(key, value, i);
                }
            }
        }
        else if(value.isEmpty()){
            key.changeID(String.valueOf(i));
        }
        }
    }

    /**
     * Метод за извеждане на данните форматирано.
     *
     * @return връща низ с данни форматирани за файла.
     */
    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append("<").append(getName()).append(">\n");
        for(Map.Entry<Header, Content> tag: getMainTag().entrySet()) {
            builder.append("\t<").append(tag.getKey().toString()).append(">\n");
            if(tag.getValue()!=null) {
                    builder.append(tag.getValue().toString());
            }
                    builder.append("\t</").append(tag.getKey().getName()).append(">\n");
        }
        builder.append("</").append(getName()).append(">");
        return builder.toString();
    }
}
