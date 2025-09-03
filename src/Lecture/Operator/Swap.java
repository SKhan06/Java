package Lecture.Operator;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your first No.");
        int a = input.nextInt();
        System.out.println("Please Enter your second No.");
        int b = input.nextInt();
//        int temp=a;
//        a=b;
//        b=temp;

        a = a -b;
        b = a+ b;
        a = b - a;
       System.out.println("a:"+a);;
        System.out.println("b:"+b);



    }
}
