package menu.items;

import main_class.MainTag;
import menu.program_actions.GetNewChild;


/**
 * ���� ������������ ����������� Action �� ������ �� ������ �� �������� �� ��� ��������� �� �������.
 *
 * @see MainTag
 * @see GetNewChild
 * @see Action
 */
public class NewChild implements Action{
    /**
     * ������������� �� ������������� �����. ��������� ���� ���� ���������, ����� �� ���������,
     * � ����� � ��� �� �, ������� ��������� ���������. � �������� ������, ���������� ������� �����������
     * � ���������� � �������� �������� �������.
     *
     * @param mainTag ���� �������� ������� �� �����.
     * @param data ����� �� ������, ��������� ��������� �� ��������� �� ����������.
     * @param file ��� �������� �������� � ����� �� �����, ����� �� �����������.
     */
    @Override
    public void action(MainTag mainTag, String[] data, String file){
        if(data.length==3) {
            GetNewChild getNewChild=new GetNewChild();
            String id=data[1];
            String name=data[2];

            getNewChild.action(mainTag, id, name);
        }
        else{
            System.out.println("��������� ����� �� ������� "+data[0]+"\n");
        }
    }
}
