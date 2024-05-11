package main_class;

import java.util.HashMap;
import java.util.Map;

/**
 * ����, � ����� �� ����������� ��������� ������ ��� ����� � �������� ���������� � ����.
 * ��� �������, �� �� ����������� ����������� ��� ����.
 */
public class Header {
    /**
     * name ������������ ��� � ����� �� ����.
     */
    private String name;
    /**
     * extensions ������������ hash map, �������� ������������ �� ���� � ������� ���������.
     */
    private Map<String, String> extension;

    /**
     * ����������� �� �����.
     *
     * @param name ��� � ��� �� ����
     */
    public Header(String name){
        this.name=name;
        extension=new HashMap<>();
    }

    /**
     * ����� �� �������� �� ����������. ��� ���������� � ������, �� �� �� ������� ���� ������.
     *
     * @param key ��� ����������.
     * @param value �������� �� ����������.
     */
    public void addExtension(String key, String value){
        if(value==null){
            extension.put(key, "");
        }else {
            extension.put(key, value);
        }
    }

    /**
     * ����� �� ������� �� ������������ id.
     *
     * @param r ���� �������� �� id.
     */
    protected void changeID(String r){
        extension.replace("id", r);
    }

    /**
     * ����� �� ������ �� ����.
     *
     * @return ����� ������������, ��������� ����� ����.
     */
    public String getName(){
        return name;
    }

    /**
     * ����� �� ������ �� ������������.
     *
     * @return ����� ������������, ��������� ������������.
     */
    public Map<String, String> getExtension(){
        return extension;
    }

    /**
     * ����� �� ��������� �� ������� �����������.
     *
     * @return ����� ��� � ����� ����������� �� �����.
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
