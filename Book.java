import java.util.ArrayList;
import java.util.List;

class Book {
    protected String title;
    protected String author;
    protected int year;
    protected String isbn;
    protected boolean isAvailable;

    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public void changeAvailability(boolean status) {
        this.isAvailable = status;
    }

    public String getInfo() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year + ", ISBN: " + isbn +
                ", Available: " + (isAvailable ? "Yes" : "No");
    }






}


