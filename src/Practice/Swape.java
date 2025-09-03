package Practice;

public class Swape {
    public static void main(String[] args) {
          int a = 10;
          int b = 5;
//
//        int temp = b;
//        b = a + b ;
//        a = temp;
//        System.out.println("a : " +a);
//        System.out.println("b : " +b );

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);



    }
}
