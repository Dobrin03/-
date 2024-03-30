package main_class;

import java.util.Objects;

public class Header {
    public String name;
    public String id;

    public Header(String name, String id){
        this.name=name;
        this.id=id;
    }

    protected void setId(String id){
        this.id=id;
    }

    @Override
    public String toString(){
        return (name+" id='"+id+"'");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Header header = (Header) o;
        return Objects.equals(name, header.name) && Objects.equals(id, header.id);
    }
}
