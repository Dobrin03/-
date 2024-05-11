package menu;

import main_class.MainTag;
import menu.items.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ����, ����� ������� hash map �� ������� � �������� �� ���������. ������ ��������� ������ �������� �� ����������
 * ���� ��������� � hash map ��� ��������� ���� �� ��������� ��� ������������.
 *
 * @see MainTag
 * @see menu.items
 */
public class MenuMap {
    /**
     * menuMap ������������ hash map, � ����� �� �� �������� ���������� �� ����������.
     */
    public Map<String, Action> menuMap = new HashMap<>();
    /**
     * save ������������ ��������� � ����� �� ��������� �� ������� � ��������� ����.
     */
    private Action save=new Save();
    /**
     * saveas ������������ ��������� � ����� �� ��������� �� ������� � ��� �����.
     */
    private Action saveAs=new SaveAs();
    /**
     * help ������������ ��������� � ����� �� ��������� �� ���������� �� ������ ������� �� ����������.
     */
    private Action help=new Help();
    /**
     * print ������������ ��������� � ����� �� ��������� �� ������������� �� �����.
     */
    private Action print=new Print();
    /**
     * select ������������ ��������� � ����� �� ��������� �������� �� ������� �� ����� ������������� �� �������� � ���� �� ��������.
     */
    private Action select=new Select();
    /**
     * set ������������ ��������� � ����� �� ����������� �� �������� �� �������.
     */
    private Action set=new Set();
    /**
     * children ������������ ��������� � ����� �� ��������� �� ������ � �������� �� ��������� ��������.
     */
    private Action children=new Children();
    /**
     * child ������������ ��������� � ����� �� ������ �� n-��� ��������� �� �������.
     */
    private Action child=new Child();
    /**
     * text ������������ ��������� � ����� �� ������ �� ������ �� �������.
     */
    private Action text=new Text();
    /**
     * delete ������������ ��������� � ����� �� ��������� �� ������� �� ������� �� ����.
     */
    private Action delete=new Delete();
    /**
     * newChild ������������ ��������� � ����� �� �������� �� ��� ��������� �� �������.
     */
    private Action newChild=new NewChild();
    /**
     * xpath ������������ ��������� � ����� �� ���������� �� ������XPath 2.0 ������ ��� ����� �������, ����� ����� ������ �� XML ��������.
     */
    private Action xpath=new XPath();
    /**
     * exit ������������ ��������� � ����� �� �������� �� ����������.
     */
    private Action exit=new Exit();

    /**
     * ����������� �� �����. ��� ������������� �� �������� �������������� ���� ��������� ��� ����������.
     * �� ����
     */
    public MenuMap(){
        menuMap.put("save", save);
        menuMap.put("saveas", saveAs);
        menuMap.put("help", help);
        menuMap.put("print", print);
        menuMap.put("select", select);
        menuMap.put("set", set);
        menuMap.put("children", children);
        menuMap.put("child", child);
        menuMap.put("text", text);
        menuMap.put("delete", delete);
        menuMap.put("newchild", newChild);
        menuMap.put("xpath", xpath);
        menuMap.put("exit", exit);
    }

    /**
     * ����� �� ������ �� ��������� �� ����������. �������� ������� �� ����� �� �� ��������, ��� �����
     * �������� ������� �� ����� � ������.
     *
     * @param mainTag ���� �������� ������� �� �����.
     * @param key ����� �� ������, �������� ����� �� ������ �� ��������� � ������� ���������.
     * @param file ��� �������� �������� � ����� �� �����, ����� �� �����������.
     * @throws IOException ��������� �� ������ � �������.
     */
    public void executeAction(MainTag mainTag, String[] key, String file) throws IOException {
        if (mainTag!= null || key[0].contains("help") || key[0].contains("exit")){
            menuMap.get(key[0]).action(mainTag, key, file);
        } else {
            System.out.println("�� ���� �� �� ������� ���� ������� �� ������ ����\n");
        }
    }
}
