package menu.load_unload_file;

import main_class.MainTag;

import java.io.IOException;

/**
 * ���� �������������� MainTagState �� ������ �� ������ �� ��������� �� ���� � ����������.
 *
 * @see MainTag
 * @see MainTagState
 */
public class Close implements MainTagState {
    /**
     * ������������ ������������� �����. ��������� ���� ���� ���������, ����� �� ���������,
     * � ����� � ��� �� �, ������� ��������� ���������. � �������� ������, ���������� ������� �����������
     * � ���������� � �������� �������� �������.
     *
     * @param mainTag ���� �������� ������� �� �����.
     * @param data ����� �� ������, ��������� ��������� �� ��������� �� ����������.
     * @return ����� ���� �� ��������� ���� ��� �������� ������� �� �����.
     */
    @Override
    public MainTag changeState(MainTag mainTag, String[] data) {
        if(data.length==1) {
            System.out.println("���������� �� �������\n");
            return null;
        }
        else{
            System.out.println("��������� ����� �� ������� "+data[0]+"\n");
        }
        return mainTag;
    }
}
