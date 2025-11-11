package Challenge.NestedProblem.Library;

public class DVD extends LibraryItem{
     int Duration;

     public DVD(int itemId, String title, String author, int duration) {
          super(itemId, title, author);
          Duration = duration;
     }
}
