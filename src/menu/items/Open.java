package menu.items;

import files.ReadFile;
import main_class.MainTag;
import menu.file_actions.SaveInSameFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Open implements Action{
    SaveInSameFile save;
    @Override
    public void action(MainTag mainTag, Scanner scanner) throws IOException {
        System.out.println("Въведете път на файла: ");
        String path=scanner.nextLine();

        System.out.println("Въведете име на файла: ");
        String name=scanner.nextLine();

        ReadFile read=new ReadFile(name, path);
        if(read.file.exists()) {
            read.action(mainTag);
            save=new SaveInSameFile(name, path);
        }
    }
}
