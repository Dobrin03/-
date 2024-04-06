package files;

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
    private String path;
    public File file;

    public ReadFile(String fileName, String path) throws IOException {
        this.fileName=fileName;
        this.path=path;
        file=new File(path+"/"+fileName+".xml");
        if(file.exists()) {
            fileReader = new Scanner(file);
        }
        else {
            System.out.println("Този xml файл не съществува");
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
            if(data.contains("<") && data.contains(">") && mainTagName==null){
                mainTagName=data.substring(data.indexOf("<")+1, data.indexOf(">"));
                mainTag.setName(mainTagName);
            }

            if(data.contains("id=")){
                headerName=data.substring(data.indexOf("<")+1, data.indexOf(" "));
                if(data.indexOf("=")+2!=data.indexOf(">")-1) {
                    headerId = data.substring(data.indexOf("=") + 2, data.indexOf(">") - 1);
                }
                else{
                    headerId=null;
                }

                header=new Header(headerName, headerId);
            }

            if(data.contains("\t\t")){
                contentTagName=data.substring(data.indexOf("<")+1, data.indexOf(">"));
                contentData=data.substring(data.indexOf(" ")+1, data.indexOf("</")-1);

                content.addInfo(contentTagName, contentData);
            }

            if(data.contains("</"+headerName+">")){
                mainTag.addContent(header, content);
                content=new Content();
            }
        }

        fileReader.close();
        return mainTag;
    }
}
