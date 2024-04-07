package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Search {
    public Header searchHeaderById(MainTag mainTag, String id){
        for(Header header: mainTag.mainTag.keySet()){
            if(header.id.equals(id)){
                return header;
            }
        }

        return null;
    }

    public List searchHeaderByName(MainTag mainTag, String name){
        List<Header> headers=new ArrayList<>();
        for(Header header: mainTag.mainTag.keySet()){
            if(header.name.equals(name)){
                headers.add(header);
            }
        }

        return headers;
    }

    public String searchForAttributeById(MainTag mainTag, String name, String id, String attribute){
        StringBuilder builder=new StringBuilder();
        Header header=searchHeaderById(mainTag, id);

        if(mainTag.mainTag.get(header)!=null) {
            if (header != null && header.name.equals(name) && mainTag.mainTag.get(header).attributes.containsKey(attribute)) {
                builder.append(mainTag.mainTag.get(header).attributes.get(attribute));
            }
        }

        return builder.toString();
    }

    public String searchForAttributeList(MainTag mainTag, String name, String attribute){
        StringBuilder builder=new StringBuilder();
        List<Header> headers=searchHeaderByName(mainTag, name);

        for (Header header: headers) {
            if(mainTag.mainTag.get(header)!=null) {
                if (mainTag.mainTag.get(header).attributes.containsKey(attribute)) {
                    builder.append(mainTag.mainTag.get(header).attributes.get(attribute)).append('\n');
                }
            }
        }

        return builder.toString();
    }

    public String searchForIdList(MainTag mainTag, String name){
        StringBuilder builder=new StringBuilder();
        List<Header> headers=searchHeaderByName(mainTag, name);

        for (Header header: headers) {
            builder.append(header.id).append('\n');
        }

        return builder.toString();
    }

    public String searchForAttributeListByUniqueAttribute(MainTag mainTag, String name, String search, String value, String find){
        StringBuilder builder=new StringBuilder();
        List<Header> headers=searchHeaderByName(mainTag, name);

        for (Header header: headers) {
            if(mainTag.mainTag.get(header)!=null) {
                if (mainTag.mainTag.get(header).attributes.containsKey(search)
                        && mainTag.mainTag.get(header).attributes.containsKey(find)) {
                    if (mainTag.mainTag.get(header).attributes.get(search).equals(value)) {
                        builder.append(mainTag.mainTag.get(header).attributes.get(find)).append('\n');
                    }
                }
            }
        }

        return builder.toString();
    }
}
