package Files;

import java.io.IOException;
import java.util.Scanner;

public class ReadFile extends FileCreate{
    private Scanner fileReader;

    public ReadFile(String fileName) throws IOException {
        super(fileName);
        super.createFile();
        fileReader = new Scanner(file);
    }

    public void readFile(){
        String data, tagName= null, headerName = null, id = null, contentName = null, content = null;

        while (fileReader.hasNextLine()){
            data=fileReader.nextLine();
            if(data.contains("</")){
                tagName=data.substring(data.indexOf("<"), data.indexOf(">"));
            } else if (data.contains("\t<")) {
                headerName=data.substring(data.indexOf("<"), data.indexOf(" "));
                id=data.substring(data.indexOf("'"), data.indexOf("'"));
            } else if (data.contains("\t\t<")) {
                contentName=data.substring(data.indexOf("<"), data.indexOf(">"));
                content=data.substring(data.indexOf(">"), data.indexOf("<"));
            }
        }

        System.out.println(tagName+headerName+id+contentName+content);
    }
}
