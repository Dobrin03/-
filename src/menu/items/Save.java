package menu.items;

import main_class.MainTag;
import menu.file_actions.SaveInSameFile;
import menu.load_unload_file.Open;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Save implements Action{
    @Override
    public void action(MainTag mainTag, String[] data, String file) throws IOException {
        if(data.length==1){
            SaveInSameFile save=new SaveInSameFile(file);

            if(Files.exists(save.getPathName())) {
                save.action(mainTag.toString());
            }
            else {
                System.out.println("Тази пътека не съществува\n");
            }
        }else {
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
