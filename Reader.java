import java.util.ArrayList;
import java.util.List;

class Reader {
    private String name;
    private String id;
    private List<Book> borrowedBooks;


    public Reader(String name, String id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable) {
            borrowedBooks.add(book);
            book.changeAvailability(false);
            System.out.println(name + " borrowed: " + book.title);
        } else {
            System.out.println(book.title + " is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.changeAvailability(true);
            System.out.println(name + " returned: " + book.title);
        } else {
            System.out.println(name + " does not have this book.");
        }
    }
}
