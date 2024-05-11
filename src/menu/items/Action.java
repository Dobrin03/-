package menu.items;

import main_class.MainTag;

import java.io.IOException;

/**
 * ���������, ���� ����� �� ������������� ����� �� ��������� ��������� �� ����������.
 *
 * @see MainTag
 */
public interface Action {
    /**
     * �����, ����� ������ ������� ��������� � �� ������� ��� ����������� ������� �� ����������.
     *
     * @param mainTag ���� �������� ������� �� �����.
     * @param data ����� �� ������, ��������� ��������� �� ��������� �� ����������.
     * @param file ��� �������� �������� � ����� �� �����, ����� �� �����������.
     * @throws IOException ��������� �� ������ � �������.
     */
    void action(MainTag mainTag, String[] data, String file) throws IOException;
}
