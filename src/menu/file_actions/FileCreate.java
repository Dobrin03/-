package menu.file_actions;

import java.io.File;
import java.io.IOException;


/**
 * ���������� ����, ����� ������� ���� �� ��������� �� ������� ���� ������� �� ����������.
 * ������� ���������� ����� �� �������� ���� ������ � �������� ������� ��� ���� ����������.
 */
public abstract class FileCreate {
    /**
     * file ������������, ������, � ����� �� ������� ������ �����.
     */
    private File file;

    /**
     * ����������� �� �����. ������� ���� � �������� �� ����������� �������� � ��� � ���������� '.xml'.
     *
     * @param fileName ��� � �������� � ����� �� �����.
     */
    protected FileCreate(String fileName){
        file=new File(fileName+".xml");
    }

    /**
     * ����� �� ������ �� �����.
     *
     * @return ����� ������������, �������� �����.
     */
    public File getFile(){
        return file;
    }

    /**
     * ���������� ����� �� �������� ���� ������ � �������� ������� ��� ���� ����������.
     *
     * @param fileName ������ � ��� �� �����.
     * @throws IOException ��������� �� ������ � �������.
     */
    protected abstract void checkFile(String fileName) throws IOException;
}
