package singleresponce;

// Seperate the implementation from the book class itself.

public class BookAction {
    public void save(Book book) {
        System.out.println("Saving the book: " + book.getName());
    }
}
