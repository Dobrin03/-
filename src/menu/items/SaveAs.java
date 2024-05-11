package menu.items;

import menu.file_actions.WriteFile;
import main_class.MainTag;

import java.io.IOException;
import java.nio.file.Files;

/**
 * ���� ������������ ����������� Action �� ������ �� ������ �� ��������� �� ������� � ��� �����.
 *
 * @see WriteFile
 * @see MainTag
 * @see Action
 */
public class SaveAs implements Action {
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
        if (data.length == 2) {
            String name = data[1];

            WriteFile write = new WriteFile(name);
            if (Files.exists(write.getPathName())) {
                write.action(mainTag.toString());
            }
            else {
                System.out.println("���� ������ �� ����������\n");
            }
        }
        else{
            System.out.println("��������� ����� �� ������� "+data[0]+"\n");
        }
    }
}
