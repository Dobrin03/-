package menu.items;

import main_class.MainTag;

import java.io.IOException;
import java.util.Scanner;

public interface Action {
    void action(MainTag mainTag, Scanner scanner) throws IOException;
}
