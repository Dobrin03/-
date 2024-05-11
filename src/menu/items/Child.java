package menu.items;

import main_class.MainTag;
import menu.program_actions.GetChild;


/**
 * ���� ������������ ����������� Action �� ������ �� ������ �� ������ �� n-��� ��������� �� �������.
 *
 * @see MainTag
 * @see GetChild
 * @see Action
 */
public class Child implements Action {
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
            GetChild getChild=new GetChild();
            String id=data[1];
            int n=Integer.parseInt(data[2]);

            if(getChild.action(mainTag, id, n)!=null) {
                System.out.println(getChild.action(mainTag, id, n) + '\n');
            }
            else{
                System.out.println("�� � ������ ����������\n");
            }
        }
        else{
            System.out.println("��������� ����� �� ������� "+data[0]+"\n");
        }
    }
}
