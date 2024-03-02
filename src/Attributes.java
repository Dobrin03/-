import java.util.HashMap;
import java.util.Map;

public class Attributes extends  Item{
    private HashMap<String, String> attributes;

    protected Attributes(String name, String id){
        super(name, id);
        attributes=new HashMap<>();
    }

    protected void addInfo(String key, String value){
        attributes.put(key, value);
    }

    @Override
    public String toString(){
        super.toString();
        StringBuffer buffer=new StringBuffer();
        for(Map.Entry<String, String> attribute: attributes.entrySet()) {
            buffer.append("\t\t<").append(attribute.getKey()).append("> ").append(attribute.getValue())
                    .append(" </").append(attribute.getKey()).append(">\n");
        }
        buffer.append("\t</").append(name).append(">");
        return buffer.toString();
    }
}
