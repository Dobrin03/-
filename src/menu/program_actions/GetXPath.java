package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

import java.util.Map;

public class GetXPath {
    public String action(MainTag mainTag, String command) {
        StringBuilder builder = new StringBuilder();
        Search search = new Search();
        String data;
        String tagName;
        String id;
        String attribute;
        String extension;

        if (command.contains("/") && !command.contains("=")) {
            data = command.substring(command.indexOf('/')+1);
            tagName = command.substring(0, command.indexOf('/'));

            if (data.contains("[")) {
                id = data.substring(data.indexOf('[') + 1, data.indexOf(']'));
                attribute = data.substring(0, data.indexOf('['));
                if (!search.searchForAttributeById(mainTag, tagName, id, attribute).isEmpty()) {
                    builder.append(attribute).append(" на таг ").append(tagName).append(" с id ")
                            .append(id).append(" e: ")
                            .append(search.searchForAttributeById(mainTag, tagName, id, attribute));
                }
            } else {
                if (!search.searchForAttributeList(mainTag, tagName, data).isEmpty()) {
                    builder.append("Списък със всички ").append(data).append(" във ")
                            .append(tagName).append(" тагове във файла:\n")
                            .append(search.searchForAttributeList(mainTag, tagName, data));
                }
            }
        }else if (command.contains("@")) {
            tagName = command.substring(0, command.indexOf('('));
            extension=command.substring(command.indexOf('@')+1, command.indexOf(')'));
            if(!search.searchForExtensionList(mainTag, tagName, extension).isEmpty()) {
                builder.append("Списък с всички id за тага ").append(tagName)
                        .append(":\n").append(search.searchForExtensionList(mainTag, tagName, extension));
            }
        }else if (command.contains("=")) {
            data = command.substring(command.indexOf('(') + 1);
            tagName = command.substring(0, command.indexOf('('));
            String compareTag = data.substring(data.indexOf('(') + 1, data.indexOf('='));
            String value = data.substring(data.indexOf('"') + 1, data.lastIndexOf('"'));
            String searchTag = data.substring(data.indexOf('/') + 1);

            if(!search.searchForAttributeListByUniqueAttribute(mainTag, tagName, compareTag, value, searchTag).isEmpty()){
                builder.append("Списък с всички ").append(searchTag).append(" в таг ").append(tagName)
                        .append(", за които ").append(compareTag).append(" e със стойност ").append(value).append(":\n")
                        .append(search.searchForAttributeListByUniqueAttribute(mainTag, tagName, compareTag, value, searchTag));
            }

        }
        return builder.toString();
    }
}

