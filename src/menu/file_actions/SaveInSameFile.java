package menu.file_actions;

import java.io.IOException;

/**
 * ����, ����� ��������� ���������� �� WriteFile. ������� �� ��������� �� ������� �� ���������� � ��������� ����.
 */
public class SaveInSameFile extends WriteFile {
    /**
     * ����������� �� �����. ��� ������������� �� ������� ������������ �� ����������� ����.
     *
     * @param fileName ���, �������� �������� � ����� �� �����.
     * @throws IOException ��������� �� ������ � �������.
     */
    public SaveInSameFile(String fileName) throws IOException {
        super(fileName);
    }
}
