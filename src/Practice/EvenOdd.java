package Practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to EvenOdd Calculator");
        System.out.println("Entre the Number");
        int num = input.nextInt();
        if (num%2==0){
            System.out.println("This is even number ");
        }else {
            System.out.println("This is odd number ");
        }


    }
}
