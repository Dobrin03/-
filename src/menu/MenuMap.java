package menu;

import main_class.MainTag;
import menu.items.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Клас, който съдържа hash map от класове с действия за програмта. Класът съхранява всички действия на програмата
 * като стойсност в hash map със съответен ключ за извикване при инициализция.
 *
 * @see MainTag
 * @see menu.items
 */
public class MenuMap {
    /**
     * menuMap представлява hash map, в който ще се съхранят действията на програмата.
     */
    public Map<String, Action> menuMap = new HashMap<>();
    /**
     * save представлява интерфейс с метод за записване на данните в отворения файл.
     */
    private Action save=new Save();
    /**
     * saveas представлява интерфейс с метод за записване на данните в нов файла.
     */
    private Action saveAs=new SaveAs();
    /**
     * help представлява интерфейс с метод за извеждане на инструкции за всички функции на програмата.
     */
    private Action help=new Help();
    /**
     * print представлява интерфейс с метод за извеждане на съдъражанието на файла.
     */
    private Action print=new Print();
    /**
     * select представлява интерфейс с метод за извеждане стойност на атрибут по даден идентификатор на елемента и ключ на атрибута.
     */
    private Action select=new Select();
    /**
     * set представлява интерфейс с метод за присвояване на стойност на атрибут.
     */
    private Action set=new Set();
    /**
     * children представлява интерфейс с метод за извеждане на списък с атрибути на вложените елементи.
     */
    private Action children=new Children();
    /**
     * child представлява интерфейс с метод за достъп до n-тия наследник на елемент.
     */
    private Action child=new Child();
    /**
     * text представлява интерфейс с метод за достъп до текста на елемент.
     */
    private Action text=new Text();
    /**
     * delete представлява интерфейс с метод за изтриване на атрибут на елемент по ключ.
     */
    private Action delete=new Delete();
    /**
     * newChild представлява интерфейс с метод за добавяне на НОВ наследник на елемент.
     */
    private Action newChild=new NewChild();
    /**
     * xpath представлява интерфейс с метод за изпълнение на простиXPath 2.0 заявки към даден елемент, която връща списък от XML елементи.
     */
    private Action xpath=new XPath();
    /**
     * exit представлява интерфейс с метод за излизане от програмата.
     */
    private Action exit=new Exit();

    /**
     * Конструктор на класа. При инициализация се записват интерфейсовете като стойности със съответния.
     * им ключ
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
     * Метод за достъп до функциите на програмата. Повечето функции не могат да се доступят, ако класа
     * съдържат данните на файла е празен.
     *
     * @param mainTag клас съдържащ данните на файла.
     * @param key масив от низове, съдържащ ключа за достъп до командата и нужните параметри.
     * @param file низ съдържащ пътеката с името на файла, който ще обработваме.
     * @throws IOException иключение за работа с файлове.
     */
    public void executeAction(MainTag mainTag, String[] key, String file) throws IOException {
        if (mainTag!= null || key[0].contains("help") || key[0].contains("exit")){
            menuMap.get(key[0]).action(mainTag, key, file);
        } else {
            System.out.println("Не може да се изшълни тази команда на празен файл\n");
        }
    }
}
