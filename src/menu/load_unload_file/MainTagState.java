package menu.load_unload_file;

import main_class.MainTag;

import java.io.IOException;
import java.util.Scanner;

public interface MainTagState {
    MainTag changeState(MainTag mainTag, String[] data) throws IOException;
}
