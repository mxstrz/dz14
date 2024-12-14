import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Створення книг
        FictionBook fictionBook = new FictionBook("The Hobbit", "J.R.R. Tolkien", 1937, "12345", "Fantasy");
        EducationalBook educationalBook = new EducationalBook("Introduction to Algorithms", "Cormen", 2009, "67890", "Computer Science", "University");

        // Додавання книг до бібліотеки
        library.addBook(fictionBook);
        library.addBook(educationalBook);

        // Реєстрація читача
        Reader reader = new Reader("John Doe", "R001");
        library.registerReader(reader);

        // Сценарій видачі книг
        library.lendBook("12345", reader);
        library.lendBook("67890", reader);

    }
}