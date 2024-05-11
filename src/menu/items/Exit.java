package menu.items;

import main_class.MainTag;

import java.io.IOException;

/**
 * ���� ������������ ����������� Action �� ������ �� ������ �� �������� �� ����������.
 *
 * @see MainTag
 * @see Action
 */
public class Exit implements Action {
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
        if(data.length==1) {
            System.out.println("Goodbye");
        }
        else{
            System.out.println("��������� ����� �� ������� "+data[0]+"\n");
        }
    }
}
