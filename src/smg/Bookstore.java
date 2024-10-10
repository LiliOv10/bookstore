package smg;
import java.util.ArrayList;
import java.util.List;

public class Bookstore {
   private List<Book> books;

   public Bookstore(){
        books=new ArrayList<>();
    }

   public Bookstore(List<Book> books){
        this.books=books;
    }

    public List<Book> getBooks() {
       return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
   public void buyBooks(Client client, Book book){
        System.out.println("Client" + client.getName() + "bought" + book.getTitle());
        client.getBoughtBooks().add(book);
   }
}
