import java.util.Objects;

public class Header {
    protected String name;
    protected String id;

    protected Header(String name, String id){
        this.name=name;
        this.id=id;
    }

    protected void setId(String id){
        this.id=id;
    }

    @Override
    public String toString(){
        return (name+" id="+id);
    }
}
