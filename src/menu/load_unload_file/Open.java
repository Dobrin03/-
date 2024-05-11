package menu.load_unload_file;

import menu.file_actions.ReadFile;
import main_class.MainTag;

import java.io.IOException;

/**
 * ���� �������������� MainTagState �� ������ �� ������ �� ��������� �� ���� � ����������.
 *
 * @see ReadFile
 * @see MainTag
 * @see MainTagState
 */
public class Open implements MainTagState {
    /**
     * ������������ ������������� �����. ��������� ���� ���� ���������, ����� �� ���������,
     * � ����� � ��� �� �, ������� ��������� ���������. � �������� ������, ���������� ������� �����������
     * � ���������� � �������� �������� �������.
     *
     * @param mainTag ���� �������� ������� �� �����.
     * @param data ����� �� ������, ��������� ��������� �� ��������� �� ����������.
     * @return ����� ���� �� ��������� ���� ��� �������� ������� �� �����.
     * @throws IOException ��������� �� ������ � �������.
     */
    @Override
    public MainTag changeState(MainTag mainTag, String[] data) throws IOException {
        if(data.length==2) {
            String name = data[1];

            ReadFile read = new ReadFile(name);
            if (read.getFile().exists()) {
                mainTag = read.action();
                System.out.println("������ � �������� �������"+'\n');
            }
            else{
                System.out.println("���� xml ���� �� ����������"+'\n');
            }
            return mainTag;
        }
        else{
            System.out.println("��������� ����� �� ������� "+data[0]+"\n");
        }
        return mainTag;
    }
}
