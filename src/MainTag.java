import java.util.HashMap;
import java.util.Map;

public class MainTag {
    private HashMap<String, Attributes> mainTag=new HashMap<>();

    protected MainTag(HashMap<String, Attributes> mainTag){
        this.mainTag=mainTag;
    }

    protected void addInfo(String key, Attributes value){
        mainTag.put(key, value);
    }

    @Override
    public String toString(){
        StringBuffer buffer=new StringBuffer();
        for(Map.Entry<String, Attributes> tag: mainTag.entrySet()) {
            buffer.append("<").append(tag.getKey()).append("> ").append(tag.getValue().toString())
                    .append("</").append(tag.getKey()).append(">");
        }
        return buffer.toString();
    }
}
