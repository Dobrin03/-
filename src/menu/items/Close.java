package menu.items;

import main_class.MainTag;

import java.io.IOException;
import java.util.Scanner;

public class Close implements Action{
    @Override
    public void action(MainTag mainTag, Scanner scanner) throws IOException {
        mainTag=new MainTag(null);
    }
}
