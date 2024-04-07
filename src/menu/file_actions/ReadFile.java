package menu.file_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;
import menu.items.Action;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class ReadFile {
    private Scanner fileReader;
    private String fileName;
    public File file;

    public ReadFile(String fileName) throws IOException {
        this.fileName=fileName;
        file=new File(fileName+".xml");
        if(file.exists()) {
            fileReader = new Scanner(file);
        }
        else {
            System.out.println("Този xml файл не съществува"+'\n');
        }
    }

    public MainTag action(){
        MainTag mainTag=new MainTag(null);
        Header header = null;
        Content content = new Content();

        String data;
        String mainTagName = null;
        String headerName=null;
        String headerId=null;
        String contentTagName=null;
        String contentData=null;

        while (fileReader.hasNextLine()){
            data=fileReader.nextLine();
            if(data.contains("<") && mainTagName==null){
                mainTagName=data.substring(data.indexOf("<")+1, data.indexOf(">"));
                mainTag.setName(mainTagName);
            }else if(data.contains("id=")){
                headerName=data.substring(data.indexOf("<")+1, data.indexOf(" "));
                if(data.indexOf("'")+1!=data.lastIndexOf("'")) {
                    headerId = data.substring(data.indexOf("'") + 1, data.lastIndexOf("'"));
                }
                else{
                    headerId=null;
                }

                header=new Header(headerName, headerId);
            }else if(data.contains("\t\t")){
                contentTagName=data.substring(data.indexOf("/")+1, data.lastIndexOf(">"));
                contentData=data.substring(data.indexOf(" ")+1, data.lastIndexOf(" "));

                content.addInfo(contentTagName, contentData);
            }else if(data.contains("</"+headerName+">")){
                mainTag.addContent(header, content);
                content=new Content();
            }
        }

        fileReader.close();
        return mainTag;
    }
}
