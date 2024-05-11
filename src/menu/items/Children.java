package menu.items;

import main_class.MainTag;
import menu.program_actions.GetChildren;

/**
 * ���� ������������ ����������� Action �� ������ �� ������ �� ��������� �� ������ � �������� �� ��������� ��������.
 *
 * @see MainTag
 * @see GetChildren
 * @see Action
 */
public class Children implements Action {
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
        if(data.length==2) {
            GetChildren getChildren=new GetChildren();
            String id=data[1];

            if(getChildren.action(mainTag, id)!=null) {
                System.out.println(getChildren.action(mainTag, id).toString() + '\n');
            }
            else{
                System.out.println("� ���� ������� ���� ������� ��������\n");
            }
        }
        else{
            System.out.println("��������� ����� �� ������� "+data[0]+"\n");
        }
    }
}
