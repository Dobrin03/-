package menu.items;

import main_class.MainTag;
import menu.program_actions.GetSelect;

/**
 * ���� ������������ ����������� Action �� ������ �� ������ �� ��������� �������� �� ������� �� ����� ������������� �� �������� � ���� �� ��������.
 *
 * @see MainTag
 * @see GetSelect
 * @see Action
 */
public class Select implements Action {
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
            GetSelect getSelect=new GetSelect();
            String id=data[1];
            String key=data[2];

            if (getSelect.action(mainTag, id, key)!=null) {
                System.out.println(getSelect.action(mainTag, id, key));
            }
            else {
                System.out.println("�� � ������ ������� �������\n");
            }
        }
        else{
            System.out.println("��������� ����� �� ������� "+data[0]+"\n");
        }
    }
}
