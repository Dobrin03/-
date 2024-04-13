package menu.items;

import menu.file_actions.WriteFile;
import main_class.MainTag;

import java.io.IOException;
import java.nio.file.Files;

public class SaveAs implements Action {
    @Override
    public void action(MainTag mainTag, String[] data, String file) throws IOException {
        if (data.length == 2) {
            String name = data[1];

            WriteFile write = new WriteFile(name);
            if (Files.exists(write.getPathName())) {
                write.action(mainTag.toString());
            }
            else {
                System.out.println("Тази пътека не съществува\n");
            }
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
