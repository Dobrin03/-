package menu.load_unload_file;

import main_class.MainTag;
import menu.items.Action;

import java.io.IOException;
import java.util.Scanner;

public class Close implements MainTagState {
    @Override
    public MainTag changeState(Scanner scanner) {
        return null;
    }
}
