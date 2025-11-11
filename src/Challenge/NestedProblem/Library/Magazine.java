package Challenge.NestedProblem.Library;

public class Magazine extends LibraryItem{
      int issueNumber;

      public Magazine(int itemId, String title, String author, int issueNumber) {
            super(itemId, title, author);
            this.issueNumber = issueNumber;
      }
}
