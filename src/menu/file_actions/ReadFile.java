package menu.file_actions;

import main_class.Content;
import main_class.Header;
import main_class.MainTag;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Клас, който чете файл и записва данните в програмата.
 *
 * @see main_class
 */
public class ReadFile {
    /**
     * fileReader представлява скенер, който чете файла ред по ред.
     */
    private Scanner fileReader;
    /**
     * fileName представлява низ, който съдържа пътеката с името на файла.
     */
    private String fileName;
    /**
     * file представлява файлът, от който програмата ще вземе данните.
     */
    private File file;

    /**
     * Конструктор на класа. Създава файл, от който ще четем и го зарежда в скенера, ако той съществува.
     *
     * @param fileName низ с пътеката и името на файла.
     * @throws IOException иключение за работа с файлове.
     */
    public ReadFile(String fileName) throws IOException {
        this.fileName=fileName;
        file=new File(fileName+".xml");
        if(file.exists()) {
            fileReader = new Scanner(file);
        }
    }

    /**
     * Метод за достъп до файла.
     *
     * @return връща променливата, съдржаща файла.
     */
    public File getFile(){
        return file;
    }

    /**
     * Методът, който чете файла. Файлът се чете ред по ред, проверява данните и ги записва нужната
     * информация в съответния клас, от който потребителя може да ги достигне от програмата.
     *
     * @return връща класа със записаните данни от файла.
     */
    public MainTag action(){
        MainTag mainTag=new MainTag(null);
        Header header = null;
        Content content = new Content();

        String data;
        String tabs="\t\t";
        String mainTagName = null;
        String headerName=null;
        String headerKey=null;
        String headerValue=null;
        int newIndex, oldIndex=0;
        String contentTagName;
        String contentData;
        boolean hasContent=false;

        while (fileReader.hasNextLine()){
            data=fileReader.nextLine();
            if(data.contains("<") && mainTagName==null){
                mainTagName=data.substring(data.indexOf("<")+1, data.indexOf(">"));
                mainTag.setName(mainTagName);
            }else if(data.contains("\t") && !data.contains(tabs) && !data.contains("/")){
                headerName=data.substring(data.indexOf("<")+1, data.indexOf(" "));
                header=new Header(headerName);

                newIndex=data.indexOf('=');
                while(newIndex>=0){
                    if(headerKey==null){
                        headerKey=data.substring(data.indexOf(" ")+1, newIndex);
                    }else {
                        headerKey = data.substring(data.indexOf(' ', oldIndex)+1,
                                newIndex);
                    }
                    if(newIndex+2 !=data.indexOf("'", newIndex+2)){
                        headerValue=data.substring(newIndex+2, data.indexOf("'", newIndex+2));
                    }
                    else{
                        headerValue=null;
                    }

                    header.addExtension(headerKey, headerValue);
                    oldIndex=newIndex;
                    newIndex=data.indexOf("=", data.indexOf(headerKey)+headerKey.length()+2);
                }
            }else if(data.contains(tabs)){
                hasContent=true;
                contentTagName=data.substring(data.indexOf("/")+1, data.lastIndexOf(">"));
                if(data.indexOf(">")+1 != data.lastIndexOf("<")) {
                    contentData = data.substring(data.indexOf(">") + 1, data.lastIndexOf("<"));
                }
                else{
                    contentData=null;
                }

                content.addInfo(contentTagName, contentData);
            }else if(data.contains("</"+headerName+">")){
                if(!hasContent){
                    content=null;
                }

                mainTag.addContent(header, content);
                content=new Content();
                hasContent=false;
                headerKey=null;
            }
        }

        fileReader.close();
        return mainTag;
    }
}
