package menu.program_actions;

import main_class.Header;
import main_class.MainTag;

/**
 * ���� � ����� �� �������� �� ��� ��������� �� �������.
 *
 * @see Header
 * @see MainTag
 */
public class GetNewChild {
    /**
     * ����� �� �������� �� ��� ��������� �� �������. ��������� ��� ���� Header � ���, �������� ����������
     * id � �� �������� ��� ����� ��� ��������.
     *
     * @param mainTag ���� �������� ������� �� �����.
     * @param name ��� � ��� �� ����� ���.
     * @param id ��� � �������������� �� ��������� ���.
     */
    public void action(MainTag mainTag, String name, String id){
        Header header=new Header(name);
        header.addExtension("id", id);
        mainTag.addContent(header, null);
        System.out.println("���������� � �������\n");
    }
}
