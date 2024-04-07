package menu.items;

import main_class.MainTag;
import menu.program_actions.GetXPath;

import java.io.IOException;

public class XPath implements Action{
    @Override
    public void action(MainTag mainTag, String[] data) throws IOException {
        if(data.length==2){
            String command=data[1];

            GetXPath getXPath=new GetXPath();
            if(!getXPath.action(mainTag, command).isEmpty()){
                System.out.println(getXPath.action(mainTag, command));
            }
            else{
                System.out.println("Не е открит реултат за тази команда\n");
            }
        }
        else{
            System.out.println("Невалидна команда за "+data[0]+'\n');
        }
    }
}
