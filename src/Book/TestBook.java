package Book;
import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1=new Book("Harry Potter");
        Book b2=new Book("Hobbit",744);
        b1.setPages(567);
        b1.result();
        b2.result();
    }
}
