package NewBooks;

public class Lib {
	private Book[] books;
    private int C;

    // Constructor
    public Lib(int size) {
        books = new Book[size];
        C = 0;
    }

    // Add new book
    public void addBook(Book book) {
        if (C < books.length) {
            books[C++] = book;
            System.out.println("Book added: " + book.IsAvailable());
        } else {
            System.out.println("Library is full! Cannot add more books.");
        }
    }

    // Show all books
    public void showAllBooks() {
        System.out.println("Library Books");
        for (int i = 0; i <C; i++) {
            books[i].showDetails();
        }
    }
}


