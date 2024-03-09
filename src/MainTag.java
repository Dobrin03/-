import java.util.HashMap;
import java.util.Map;

public class MainTag {
    private String name;
    private Map<Header, Content> mainTag;

    protected MainTag(String name){
        mainTag=new HashMap<>();
        this.name=name;
    }

    protected void addContent(Header key, Content value){
        mainTag.put(key, value);
    }

    private boolean checkForRepeat(Header key){
        for(Map.Entry<Header, Content> tag : mainTag.entrySet()){
            if(tag.getKey().id.equals(key.id)){
                return true;
            }
        }
        return false;
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
