package menu.load_unload_file;

import menu.file_actions.ReadFile;
import main_class.MainTag;

import java.io.IOException;

public class Open implements MainTagState {
    @Override
    public MainTag changeState(MainTag mainTag, String[] data) throws IOException {
        if(data.length==2) {
            String name = data[1];

            ReadFile read = new ReadFile(name);
            if (read.file.exists()) {
                mainTag = read.action();
                System.out.println("Файлът е прочетен успешно"+'\n');
            }
            return mainTag;
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
        return mainTag;
    }
}
