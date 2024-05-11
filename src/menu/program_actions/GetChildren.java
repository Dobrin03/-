package menu.program_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

/**
 * ����, �������� ����� �� ��������� �� ������ � �������� �� ��������� ��������.
 *
 * @see main_class
 * @see Search
 */
public class GetChildren {
    /**
     * ����� �� ��������� �� ������ � �������� �� ��������� ��������. �������� ������ ���� Content, � �����
     * �� �� ������� ��������� � ���� ��������� �� ����� Search �� ������� �������� ���, �������� ����������.
     * ��� ��� ����� ������� ��� ��� �����, �� �� ������ ������� � ����������.
     *
     * @param mainTag ���� �������� ������� �� �����.
     * @param id ��� � �������������� �� ��������� ���.
     * @return ����� ��������� �� �������� ����, ������� �������� �� ��������.
     */
    public Content action(MainTag mainTag, String id){
        Content content=null;
        Search search=new Search();
        Header selectedHeader=search.searchHeaderById(mainTag, id);

        if(selectedHeader!=null && mainTag.getMainTag().get(selectedHeader)!=null){
            content=mainTag.getMainTag().get(selectedHeader);
        }

        return content;
    }
}
