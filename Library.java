import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.title);
    }

    public void registerReader(Reader reader) {
        readers.add(reader);
        System.out.println("Registered reader: " + reader.getName());
    }

    public void lendBook(String isbn, Reader reader) {
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                reader.borrowBook(book);
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }
}