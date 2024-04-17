package main_class;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainTag {
    private String name;
    private Map<Header, Content> mainTag;

    public MainTag(String name){
        mainTag=new HashMap<>();
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void addContent(Header key, Content value){
        checkForRepeatId(key, key.getExtension().get("id"), 1);
        mainTag.put(key, value);
    }

    public String getName(){
        return name;
    }

    public Map<Header, Content> getMainTag(){
        return mainTag;
    }

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
