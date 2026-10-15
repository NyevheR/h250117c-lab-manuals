// Lab 9 - Intermediate 1: two books are "equal" when their ISBN is equal
public class Book {
    private String isbn;
    private String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Book)) {
            return false;
        }
        Book b = (Book) other;
        return isbn.equals(b.isbn);
    }

    // equal books MUST give the same hash code, so we also use the isbn here
    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return title + " [" + isbn + "]";
    }
}
