package menu.items;

import main_class.MainTag;

import java.io.IOException;

public class Help implements Action{
    @Override
    public void action(MainTag mainTag, String[] data) throws IOException {
        if(data.length==1) {
            System.out.println("Операции на програмата:\n" +
                    "open <пътека> <име на файл(без разширение)> - отваря файл\n" +
                    "close - затваря вече отворения файл\n" +
                    "save - запазва данните във вече отворения файл\n" +
                    "saveas <пътека> <име на файл(без разширение)>- запазва данните на вече отворения файл в нов файл\n" +
                    "help - изкарва тази информация\n" +
                    "exit - затваря програмата\n" +
                    "print - извежда съсдържанието на отворения файл\n" +
                    "select <id> <ключ> - извежда стойност на атрибут по даден идентификатор на елемента и ключ на атрибута\n" +
                    "set <id> <ключ> <стойност> - присвоява на стойност на атрибут\n" +
                    "children <id> - извежда списък с атрибути на вложените елементи\n" +
                    "child <id> <позиция> - дава достъп до n-тия наследник на елемент\n" +
                    "text <id> - отваря файл\n" +
                    "delete <id> <ключ> - изтрива на атрибут на елемент по ключ\n" +
                    "newchild <id> - добавя на нов наследник на елемент. \n" +
                    "xpath <id> <XPath> - изпълнява операции на прости XPath 2.0 заявки към даден елемент \n");
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
