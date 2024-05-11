package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

/**
 * ���� � ����� �� ������� �������� �� ������� �� ����� ������������� �� �������� � ���� �� ��������.
 *
 * @see main_class
 * @see Search
 */
public class GetSelect {
    /**
     * ����� �� ������� �������� �� ������� �� ����� ������������� �� �������� � ���� �� ��������. ���� ����������
     * �� ���� Search, �������� ���� Header ��� ����������� id. ��� ���������� ����� ��� �����, ���������
     * ���������� �� � ���� Content � ��������� ���������� �� ������� �������.
     *
     * @param mainTag ���� �������� ������� �� �����.
     * @param id ��� � �������������� �� ��������� ���.
     * @param key ��� � ����� �� ��������.
     * @return ����� ��� � ��������� �� ��������� �� �������� �� �������.
     */
    public String action(MainTag mainTag, String id, String key){
        Search search=new Search();
        Header selectedHeader=search.searchHeaderById(mainTag, id);
        Content selectedContent=null;

        if(selectedHeader!=null && mainTag.getMainTag().get(selectedHeader).getAttributes().containsKey(key)) {
           selectedContent = mainTag.getMainTag().get(selectedHeader);
        }

        if(selectedContent!=null) {
            for (String k : selectedContent.getAttributes().keySet()) {
                if (k.equals(key)) {
                    return selectedContent.getAttributes().get(k);
                }
            }
        }

        return null;
    }
}
