package main_class;

import java.util.HashMap;
import java.util.Map;

/**
 * Клас, в който се запаметяват хедърните тагове във файла и неговите разширения в тага.
 * При промяна, те се запаметяват фроматирано във файл.
 */
public class Header {
    /**
     * name представлява низ с името на тага.
     */
    private String name;
    /**
     * extensions представлява hash map, съдържащ разширенията на тага и техните стойности.
     */
    private Map<String, String> extension;

    /**
     * Конструктор на класа.
     *
     * @param name низ с име на тага
     */
    public Header(String name){
        this.name=name;
        extension=new HashMap<>();
    }

    /**
     * Метод за вмъкване на разширения. Ако стойността е празна, то тя се записва като празна.
     *
     * @param key вид разширение.
     * @param value стойност на разширение.
     */
    public void addExtension(String key, String value){
        if(value==null){
            extension.put(key, "");
        }else {
            extension.put(key, value);
        }
    }

    /**
     * Метод за промяна на разширението id.
     *
     * @param r нова стойност на id.
     */
    protected void changeID(String r){
        extension.replace("id", r);
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
     * Метод за достъп до разширенията.
     *
     * @return връща променливата, съдържаща разширенията.
     */
    public Map<String, String> getExtension(){
        return extension;
    }

    /**
     * Метод за извеждане на данните форматирано.
     *
     * @return връща низ с данни форматирани за файла.
     */
    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append(getName());
        for(Map.Entry<String, String> map : getExtension().entrySet()){
            builder.append(" ").append(map.getKey()).append("='").append(map.getValue()).append("'");
        }

        return builder.toString();
    }
}
