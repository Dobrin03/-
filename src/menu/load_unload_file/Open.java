package menu.load_unload_file;

import files.ReadFile;
import main_class.MainTag;
import menu.file_actions.SaveInSameFile;
import menu.items.Action;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Open implements MainTagState {
    @Override
    public MainTag changeState(Scanner scanner) throws IOException {
        MainTag mainTag = null;
        System.out.println("Въведете път на файла: ");
        String path=scanner.nextLine();

        System.out.println("Въведете име на файла: ");
        String name=scanner.nextLine();

        ReadFile read=new ReadFile(name, path);
        if(read.file.exists()) {
            mainTag=read.action();
        }
        return mainTag;
    }
}
