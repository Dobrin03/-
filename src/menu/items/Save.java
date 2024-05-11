package menu.items;

import main_class.MainTag;
import menu.file_actions.SaveInSameFile;

import java.io.IOException;
import java.nio.file.Files;

/**
 * ���� ������������ ����������� Action �� ������ �� ������ �� ��������� �� ������� � ��������� ����.
 *
 * @see MainTag
 * @see SaveInSameFile
 * @see Action
 */
public class Save implements Action{
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
        if(data.length==1){
            SaveInSameFile save=new SaveInSameFile(file);

            if(Files.exists(save.getPathName())) {
                save.action(mainTag.toString());
            }
            else {
                System.out.println("���� ������ �� ����������\n");
            }
        }else {
            System.out.println("��������� ����� �� ������� "+data[0]+"\n");
        }
    }
}
