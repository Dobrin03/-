public class Item {
    protected String name;
    protected String id;

    protected Item(String name, String id){
        this.name=name;
        if(id.equals(this.id)) {
            //Code that extends the id number
        }else {
            this.id = id;
        }
    }

    @Override
    public String toString(){
        return ("\t<"+name+" id="+id+">\n");
    }
;}
