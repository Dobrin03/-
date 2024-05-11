package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

/**
 * ���� � ����� �� ����������� �� �������� �� �������.
 *
 * @see main_class
 * @see Search
 */
public class GetSet {
    /**
     * M���� �� ����������� �� �������� �� �������. ���� ��������� �� ���� Search �������� ���� Header
     * ��� ����������� id. ��� ���������� ����� ��� �����, ��������� � ���� Content ���������� � �����������
     * ���������� �������. ��� �� � ������� �����, ��������� ��������� ���������.
     *
     * @param mainTag ���� �������� ������� �� �����.
     * @param id ��� � �������������� �� ��������� ���.
     * @param key ��� � ����� �� ��������.
     * @param value ��� ��� ������ �������� �� ��������.
     */
    public void action(MainTag mainTag, String id, String key, String value){
        Search search=new Search();
        Header selectedHeader=search.searchHeaderById(mainTag, id);
        Content selectedContent=null;

        if(selectedHeader!=null) {
            selectedContent = mainTag.getMainTag().get(selectedHeader);
        }

        if(selectedContent!=null){
            selectedContent.getAttributes().put(key, value);
            System.out.println("������� ����������� �� ��������\n");
        }
        else {
            System.out.println("�� � ������ ������� �������\n");
        }
    }
}
