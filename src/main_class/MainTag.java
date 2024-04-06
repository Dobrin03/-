package main_class;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainTag {
    public String name;
    public Map<Header, Content> mainTag;

    public MainTag(String name){
        mainTag=new HashMap<>();
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void addContent(Header key, Content value){
        checkForRepeatId(key, key.id, 1);
        mainTag.put(key, value);
    }

    private void checkForRepeatId(Header key, String id, int i){
        if(!mainTag.isEmpty()) {
            if(key.id==null){
                for(Header header: mainTag.keySet()){
                    ++i;
                }
                key.setId(String.valueOf(i));
            }
            else {
                List<Header> headers = mainTag.keySet().stream().filter(h -> h.id.equals(key.id)).collect(Collectors.toList());

                if (mainTag.containsKey(key)) {
                    headers.remove(key);
                }

                for (Header header : headers) {
                    header.setId(id + "_" + i);
                    ++i;
                    checkForRepeatId(header, id, i);
                    key.setId(id + "_" + i);
                    checkForRepeatId(key, id, i);
                }
            }
        }
        else if(key.id==null){
            key.setId(String.valueOf(i));
        }
    }

    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append("<").append(name).append(">\n");
        for(Map.Entry<Header, Content> tag: mainTag.entrySet()) {
            builder.append("\t<").append(tag.getKey().toString()).append(">\n");
            if(tag.getValue()!=null) {
                    builder.append(tag.getValue().toString());
            }
                    builder.append("\t</").append(tag.getKey().name).append(">\n");
        }
        builder.append("</").append(name).append(">");
        return builder.toString();
    }
}
