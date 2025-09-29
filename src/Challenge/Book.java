package Challenge;

 class Book {
     static int totalNoOfBook;
     String title;
     String author;
     String isnb;
     boolean isBorrowed;
     static {
         totalNoOfBook = 0;
     }
     {
         totalNoOfBook++;
     }

     Book(String author,String title , String isnb){
         this.author = author;
         this.title = title;
         this.isnb = isnb;
     }
     Book(String isnb){
         this(isnb,"Unknown" ,"Unknown");
     }

     static int getTotalNoOfBook(){
         return totalNoOfBook;
     }
     void borrowBook(){
         if (isBorrowed){
             System.out.println("Book is already borrowed");
         }else {
             this.isBorrowed = true;
             System.out.println("Enjoy " + title);
         }
     }

     void returnBook(){
         if (isBorrowed){
             this.isBorrowed = false;
             System.out.println("hope you enjoyed, please leave a review");
         }else {
             System.out.println("this book is already in the library");

         }
     }

     public static void main(String[] args){
         Book designOfThing= new Book("Author", "design" ,"1");
         Book myBook = new Book("2");
         System.out.println(Book.getTotalNoOfBook());
         designOfThing.borrowBook();
         myBook.borrowBook();
         designOfThing.borrowBook();
         designOfThing.returnBook();
     }


}
