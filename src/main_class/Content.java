package main_class;

import java.util.HashMap;
import java.util.Map;

public class Content {
    private Map<String, String> attributes;

    public Content(){
        attributes=new HashMap<>();
    }

    public void addInfo(String key, String value){
        attributes.put(key, value);
    }

    public Map<String, String> getAttributes(){
        return attributes;
    }

    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        for(Map.Entry<String, String> attribute: attributes.entrySet()) {
            builder.append("\t\t<").append(attribute.getKey()).append(">").append(attribute.getValue())
                    .append("</").append(attribute.getKey()).append(">\n");
        }
        return builder.toString();
    }
}
