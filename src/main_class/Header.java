package main_class;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Header {
    private String name;
    private Map<String, String> extension;

    public Header(String name){
        this.name=name;
        extension=new HashMap<>();
    }

    public void addExtension(String key, String value){
        if(value==null){
            extension.put(key, "");
        }else {
            extension.put(key, value);
        }
    }

    protected void changeID(String r){
        extension.replace("id", r);
    }

    public String getName(){
        return name;
    }

    public Map<String, String> getExtension(){
        return extension;
    }

    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append(name);
        for(Map.Entry<String, String> map : extension.entrySet()){
            builder.append(" ").append(map.getKey()).append("='").append(map.getValue()).append("'");
        }

        return builder.toString();
    }
}
