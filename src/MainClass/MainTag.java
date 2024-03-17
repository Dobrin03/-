package MainClass;

import java.util.HashMap;
import java.util.Map;

public class MainTag {
    private String name;
    private Map<Header, Content> mainTag;

    public MainTag(String name){
        mainTag=new HashMap<>();
        this.name=name;
    }

    public void addContent(Header key, Content value){
        checkForRepeatId(key, key.id, 1);
        mainTag.put(key, value);
    }

    private void checkForRepeatId(Header key, String id, int i){
        if(!mainTag.isEmpty()) {
            for (Map.Entry<Header, Content> tag : mainTag.entrySet()) {
                if(mainTag.containsKey(key)){
                    continue;
                }

                if (tag.getKey().id.equals(key.id)) {
                    tag.getKey().setId(id+"_"+String.valueOf(i));
                    checkForRepeatId(tag.getKey(), id, i);
                    ++i;
                    key.setId(id+"_"+String.valueOf(i));
                    checkForRepeatId(key, id, i);
                }
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append("<").append(name).append(">\n");
        for(Map.Entry<Header, Content> tag: mainTag.entrySet()) {
            builder.append("\t<").append(tag.getKey().toString()).append(">\n").append(tag.getValue().toString())
                    .append("\t</").append(tag.getKey().name).append(">\n");
        }
        builder.append("</").append(name).append(">");
        return builder.toString();
    }
}
