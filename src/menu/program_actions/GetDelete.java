package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

/**
 * ����, �������� ����� �� ��������� �� ������� �� ������� �� ����.
 *
 * @see main_class
 * @see Search
 */

public class GetDelete {
    /**
     * ����� �� ��������� �� ������� �� ������� �� ����. ���� ��������� �� ���� Search, �������� ��������
     * ��� ��� ����������� id. ��� ��� ����� ���, ��������� � ���� Content ����������, �������� �������
     * ������� � �� ��������� �� �����. ��� �� � ������, ��������� ��������� ���������.
     *
     * @param mainTag ���� �������� ������� �� �����.
     * @param id ��� � �������������� �� ��������� ���.
     * @param key ��� � ����� �� ��������.
     */
    public void action(MainTag mainTag, String id, String key){
        Search search=new Search();
        Header selectedHeader=search.searchHeaderById(mainTag, id);
        Content selectedContent=null;

        if(selectedHeader!=null && mainTag.getMainTag().get(selectedHeader).getAttributes().containsKey(key)){
            selectedContent=mainTag.getMainTag().get(selectedHeader);
        }


        if(selectedContent!=null){
            selectedContent.getAttributes().remove(key);
            System.out.println("������������ � �������\n");
        }
        else {
            System.out.println("�� � ������ ������� �������\n");
        }
    }
}
