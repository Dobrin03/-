package menu.items;

import files.WriteFile;
import main_class.MainTag;
import menu.items.Action;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class SaveAs implements Action {
    @Override
    public void action(MainTag mainTag, Scanner scanner) throws IOException {
        System.out.println("Въведете пътека на файла: ");
        String path=scanner.nextLine();

        System.out.println("Въведете име на файла: ");
        String name=scanner.nextLine();

        WriteFile write=new WriteFile(name, path);
        if(Files.exists(write.pathName)) {
            write.action(mainTag.toString());
        }
    }
}
