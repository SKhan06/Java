package Challenge.NestedProblem.Library;

public class LibraryItem {
      int itemId;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    String title;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LibraryItem{");
        sb.append("itemId=").append(itemId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append('}');
        return sb.toString();
    }

    String author;

    public void checkout(){
         System.out.println(title + " has been checked out.");
    }
    public void returnItem(){
        System.out.println(title + " has been returned.");
    }


}
