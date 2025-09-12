package NewBooks;

interface Issueable{
void IssueBook();
void ReturnBook();       
 boolean IsAvailable();   
 void showDetails();
}

public class Book implements  Issueable {
private String title;
private String author;
private String isbn;
private boolean available;   
public Book(String title, String author, String isbn) {
this.title=title;
this.author=author;
this.isbn=isbn;
       this.available = true;
}
@Override 
public void  IssueBook() {
       if (!available) {
           System.out.println("Book" + title + "' is already provided");
       } else {
           available = false;
           System.out.println("Book" + title + "' issued provided.");
       }
   }
@Override
   public void ReturnBook() {
       if (available) {
           System.out.println("Book" + title + "was not issued");
       } else {
           available = true;

           System.out.println("Book" + title + "was returned");
       }
   }
   @Override
   public boolean IsAvailable() {
       return available;
   }
   public void showDetails() {
       System.out.println("Title " + title);
       System.out.println("Author"+author);
       System.out.println("Isbn: " + isbn);
       System.out.println("Available: " + available);
   }
}