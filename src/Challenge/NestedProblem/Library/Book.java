package Challenge.NestedProblem.Library;

public class Book extends LibraryItem{
    int ISBN;

    public Book(int itemId, String title, String author, int ISBN) {
        super(itemId, title, author);
        this.ISBN = ISBN;
    }
}
