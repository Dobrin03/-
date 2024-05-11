package menu.items;

import main_class.MainTag;
import menu.program_actions.GetSet;

/**
 * ���� ������������ ����������� Action �� ������ �� ������ �� ����������� �� �������� �� �������.
 *
 * @see MainTag
 * @see GetSet
 * @see Action
 */
public class Set implements Action {
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
        if(data.length==4) {
            GetSet getSet=new GetSet();
            String id=data[1];
            String key=data[2];
            String value=data[3];

            getSet.action(mainTag, id, key, value);
        }
        else{
            System.out.println("��������� ����� �� ������� "+data[0]+"\n");
        }
    }
}
