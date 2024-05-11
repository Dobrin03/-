package menu.program_actions;

import main_class.Content;
import main_class.MainTag;

/**
 * ���� �������� ����� �� �� ������ �� n-��� ��������� �� �������.
 *
 * @see Content
 * @see MainTag
 * @see GetChildren
 */
public class GetChild {
    /**
     * �����, ����� ������ n-��� ��������� �� �������. ����� ������� ������ � ������ �������� �� ��������
     * ������� �� id. ��� �� � ������ ������ ��� ����������� id, �������� �� � ������. � �������� ������,
     * ���� ������ �� ������� � ���� Content, �� ����� ��������� ����������, ������ �� �� ������ n-��� ��
     * ����. ��� ��������� ������� ��������� ���� ��������, ������� ������ ���.
     *
     * @param mainTag ���� �������� ������� �� �����.
     * @param id ��� � �������������� �� ��������� ���.
     * @param n ������ ����� �� ��������� �� �������� ���������.
     * @return ����� ��� � ��������� �� ��������� �� n-��� ���������.
     */
    public String action(MainTag mainTag, String id, int n){
        int i=1;
        GetChildren children=new GetChildren();
        if(children.action(mainTag, id)!=null) {
            Content content = children.action(mainTag, id);

            for (String string : content.getAttributes().keySet()) {
                if (i == n) {
                    return string;
                }
                ++i;
            }
        }

        return null;
    }
}
