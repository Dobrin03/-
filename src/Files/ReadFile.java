package Files;

import MainClass.Content;
import MainClass.Header;
import MainClass.MainTag;

import java.io.IOException;
import java.util.Scanner;

public class ReadFile extends FileCreate{
    private Scanner fileReader;

    public ReadFile(String fileName) throws IOException {
        super(fileName);
        super.createFile();
        fileReader = new Scanner(file);
    }

    public void read(MainTag mainTag){
        String data;
        String mainTagName = null;
        String headerName=null;
        String headerId=null;
        String contentTagName=null;
        String contentData=null;
        Header header = null;
        Content content = new Content();
        while (fileReader.hasNextLine()){
            data=fileReader.nextLine();
            if(data.contains("<") && data.contains(">") && mainTagName==null){
                mainTagName=data.substring(data.indexOf("<")+1, data.indexOf(">"));
                mainTag.setName(mainTagName);
            }

            if(data.contains("id=")){
                headerName=data.substring(data.indexOf("<")+1, data.indexOf(" "));
                headerId=data.substring(data.indexOf("=")+2, data.indexOf(">")-1);

                header=new Header(headerName, headerId);
            }

            if(data.contains("\t\t")){
                contentTagName=data.substring(data.indexOf("<")+1, data.indexOf(">"));
                contentData=data.substring(data.indexOf(" ")+1, data.indexOf("</")-1);

                content.addInfo(contentTagName, contentData);
            }

            if(data.contains("</"+headerName+">")){
                mainTag.addContent(header, content);
            }
        }

        fileReader.close();
    }
}
