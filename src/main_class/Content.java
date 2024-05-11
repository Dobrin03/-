package main_class;

import java.util.HashMap;
import java.util.Map;

/**
 * Клас, в който се запаметяват атрибутите на файл. При промяна, те се запаметяват фроматирано във файл.
 */
public class Content {
    /**
     * attributes представлява hash map, съдържащ ключ с тага на атрибута и неговата стойност.
     */
    private Map<String, String> attributes;

    /**
     * Конструктор на класа
     */
    public Content(){
        attributes=new HashMap<>();
    }

    /**
     * Метод за добавяне на атрибут.
     *
     * @param key таг на атрибута.
     * @param value стойност на атрибута.
     */
    public void addInfo(String key, String value){
        attributes.put(key, value);
    }

    /**
     * Метод за достъп до атрибутите.
     *
     * @return връща променливата, съдържаща атрибутите.
     */
    public Map<String, String> getAttributes(){
        return attributes;
    }

    /**
     * Метод за извеждане на данните форматирано.
     *
     * @return връща низ с данни форматирани за файла.
     */
    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        for(Map.Entry<String, String> attribute: getAttributes().entrySet()) {
            builder.append("\t\t<").append(attribute.getKey()).append(">").append(attribute.getValue())
                    .append("</").append(attribute.getKey()).append(">\n");
        }
        return builder.toString();
    }
}
