package menu.items;

import main_class.MainTag;
import menu.program_actions.GetXPath;

import java.io.IOException;

/**
 * ���� ������������ ����������� Action �� ������ �� ������ �� ���������� �� ������XPath 2.0 ������ ��� ����� �������, ����� ����� ������ �� XML ��������.
 *
 * @see MainTag
 * @see GetXPath
 * @see Action
 */
public class XPath implements Action{
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
    public void action(MainTag mainTag, String[] data, String file) throws IOException {
        if(data.length==2){
            String command=data[1];

            GetXPath getXPath=new GetXPath();
            if(!getXPath.action(mainTag, command).isEmpty()){
                System.out.println(getXPath.action(mainTag, command));
            }
            else{
                System.out.println("�� � ������ ������� �� ���� �������\n");
            }
        }
        else{
            System.out.println("��������� ������� �� "+data[0]+'\n');
        }
    }
}
