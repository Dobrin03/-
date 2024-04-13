package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Search {
    public Header searchHeaderById(MainTag mainTag, String id){
        for(Header header: mainTag.getMainTag().keySet()){
            if(header.getExtension().get("id").equals(id)){
                return header;
            }
        }

        return null;
    }

    public List searchHeaderByName(MainTag mainTag, String name){
        List<Header> headers=new ArrayList<>();
        for(Header header: mainTag.getMainTag().keySet()){
            if(header.getName().equals(name)){
                headers.add(header);
            }
        }

        return headers;
    }

    public String searchForAttributeById(MainTag mainTag, String name, String id, String attribute){
        StringBuilder builder=new StringBuilder();
        Header header=searchHeaderById(mainTag, id);

        if(mainTag.getMainTag().get(header)!=null) {
            if (header != null && header.getName().equals(name) && mainTag.getMainTag().get(header).getAttributes().containsKey(attribute)) {
                builder.append(mainTag.getMainTag().get(header).getAttributes().get(attribute));
            }
        }

        return builder.toString();
    }

    public String searchForAttributeList(MainTag mainTag, String name, String attribute){
        StringBuilder builder=new StringBuilder();
        List<Header> headers=searchHeaderByName(mainTag, name);

        for (Header header: headers) {
            if(mainTag.getMainTag().get(header)!=null) {
                if (mainTag.getMainTag().get(header).getAttributes().containsKey(attribute)) {
                    builder.append(mainTag.getMainTag().get(header).getAttributes().get(attribute)).append('\n');
                }
            }
        }

        return builder.toString();
    }

    public String searchForExtensionList(MainTag mainTag, String name, String extension){
        StringBuilder builder=new StringBuilder();
        List<Header> headers=searchHeaderByName(mainTag, name);

        for (Header header: headers) {
            if(header.getExtension().containsKey(extension)) {
                builder.append(header.getExtension().get(extension)).append('\n');
            }
        }

        return builder.toString();
    }

    public String searchForAttributeListByUniqueAttribute(MainTag mainTag, String name, String search, String value, String find){
        StringBuilder builder=new StringBuilder();
        List<Header> headers=searchHeaderByName(mainTag, name);

        for (Header header: headers) {
            if(mainTag.getMainTag().get(header)!=null) {
                if (mainTag.getMainTag().get(header).getAttributes().containsKey(search)
                        && mainTag.getMainTag().get(header).getAttributes().containsKey(find)) {
                    if (mainTag.getMainTag().get(header).getAttributes().get(search).equals(value)) {
                        builder.append(mainTag.getMainTag().get(header).getAttributes().get(find)).append('\n');
                    }
                }
            }
        }

        return builder.toString();
    }
}
