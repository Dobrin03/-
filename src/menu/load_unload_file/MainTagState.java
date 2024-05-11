package menu.load_unload_file;

import main_class.MainTag;

import java.io.IOException;

/**
 * ��������� � ����� �� ��������� �� ����� � ����������.
 *
 * @see MainTag
 */
public interface MainTagState {
    /**
     * �����, ����� ������ ������� ��������� �� ��������� �� ��������� �� ���� � �����������.
     *
     * @param mainTag ���� �������� ������� �� �����.
     * @param data ����� �� ������, ��������� ��������� �� ��������� �� ����������.
     * @return ����� ���� �� ��������� ���� ��� �������� ������� �� �����.
     * @throws IOException ��������� �� ������ � �������.
     */
    MainTag changeState(MainTag mainTag, String[] data) throws IOException;
}
