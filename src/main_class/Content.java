package main_class;

import java.util.HashMap;
import java.util.Map;

/**
 * ����, � ����� �� ����������� ���������� �� ����. ��� �������, �� �� ����������� ����������� ��� ����.
 */
public class Content {
    /**
     * attributes ������������ hash map, �������� ���� � ���� �� �������� � �������� ��������.
     */
    private Map<String, String> attributes;

    /**
     * ����������� �� �����
     */
    public Content(){
        attributes=new HashMap<>();
    }

    /**
     * ����� �� �������� �� �������.
     *
     * @param key ��� �� ��������.
     * @param value �������� �� ��������.
     */
    public void addInfo(String key, String value){
        attributes.put(key, value);
    }

    /**
     * ����� �� ������ �� ����������.
     *
     * @return ����� ������������, ��������� ����������.
     */
    public Map<String, String> getAttributes(){
        return attributes;
    }

    /**
     * ����� �� ��������� �� ������� �����������.
     *
     * @return ����� ��� � ����� ����������� �� �����.
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
