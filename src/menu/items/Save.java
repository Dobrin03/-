package menu.items;

import main_class.MainTag;

import java.io.IOException;
import java.util.Scanner;

public class Save extends Open{
    @Override
    public void action(MainTag mainTag, Scanner scanner) throws IOException {
        save.action(mainTag.toString());
    }
}
