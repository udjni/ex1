package Book;
import java.lang.*;
public class Book {
    private String name;
    private int pages;
    public Book(String n,int p){
        name=n;
        pages=p;
    }
    public Book(String n){
        name=n;
        pages=0;
    }
    public Book(){
        name="Harry Potter";
        pages=0;
    }
public void setName(){
        this.name=name;
}
public void setPages(int pages){
        this.pages=pages;
}
public int getPages(int pages){
        return pages;
}
public String getName(){
        return name;
}
public String toString(){
        return this.name+"contains "+this.pages+" pages";
}
public void result(){
        System.out.println(name+"contains "+pages+" pages");
}
}
