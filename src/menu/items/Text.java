package menu.items;

import main_class.MainTag;
import menu.program_actions.GetText;

/**
 * ���� ������������ ����������� Action �� ������ �� ������ �� ������ �� ������ �� �������.
 *
 * @see MainTag
 * @see GetText
 * @see Action
 */
public class Text implements Action {
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
            GetText getText=new GetText();
            String id=data[1];

            if(!getText.action(mainTag, id).isEmpty()) {
                System.out.println(getText.action(mainTag, id) + "\n");
            }
            else {
                System.out.println("�� � ������ ����� � ���������� �������\n");
            }
        }
        else{
            System.out.println("��������� ����� �� ������� "+data[0]+"\n");
        }
    }
}
