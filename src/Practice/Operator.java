package Practice;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        System.out.println("Entre the First no :");
        Scanner input = new Scanner(System.in);
//          int first = input.nextInt();
//          System.out.println("Entre the Second no :");
//          int second = input.nextInt();
//          int result = first & second ;
//          System.out.println("result is :"  +result);

        int first = input.nextInt();
        System.out.println("Entre the Second no :");
        int second = input.nextInt();
        int result = first |second ;
        System.out.println("result is :"  +result);

    }
}
