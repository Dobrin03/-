package menu;

import main_class.MainTag;
import menu.load_unload_file.Close;
import menu.load_unload_file.MainTagState;
import menu.load_unload_file.Open;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ����, ����� ������� hash map �� ������� � �������� �� ��������� �� ���� � ����������. ������ ��������� ������ ��������
 * �� ��������� �� ���� � ���������� ���� ��������� � hash map ��� ��������� ���� �� ��������� ��� ������������.
 *
 * @see MainTag
 * @see menu.load_unload_file
 */
public class LoadUnloadMenu {
    /**
     * menuMap ������������ hash map, � ����� �� �� �������� ���������� �� ��������� �� ���� � ����������.
     */
    public Map<String, MainTagState> mainTagState=new HashMap<>();
    /**
     * open ������������ ����, ����� ������� ���� � ����������.
     */
    private MainTagState open=new Open();
    /**
     * close ������������ ����, ����� ������� ���� �� ����������.
     */
    private MainTagState close=new Close();

    /**
     * ����������� �� �����.
     */
    public LoadUnloadMenu(){
        mainTagState.put("open", open);
        mainTagState.put("close", close);
    }

    /**
     * ����� �� ������ �� ��������� �� ��������� �� ���� � ����������.
     *
     * @param mainTag ���� �������� ������� �� �����.
     * @param key ����� �� ������, �������� ����� �� ������ �� ��������� � ������� ���������.
     * @throws IOException ��������� �� ������ � �������.
     * @return ����� ���� � ������� �� ����� ��� �������� ������� �� �����
     */
    public MainTag executeAction(MainTag mainTag, String[] key) throws IOException {
        mainTag = mainTagState.get(key[0]).changeState(mainTag, key);
        return mainTag;
    }
}
