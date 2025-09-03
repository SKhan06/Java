package Challenge;

import java.util.Scanner;

public class Challange3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1 Problem
//        System.out.println("Entre the First no :");
//        int first = input.nextInt();
//        System.out.println("Entre the Second no :");
//        int second = input.nextInt();
//        int result = first & second ;
//        System.out.println("result is :"  +result);

        // 2 Problem

//        System.out.println("Entre the First no :");
//        int first = input.nextInt();
//        System.out.println("Entre the Second no :");
//        int second = input.nextInt();
//        int result = first / second ;
//        System.out.println("result is :"  +result);


        // 3 Problem
//       System.out.println("Entre the First no :");
//        int first = input.nextInt();
//        System.out.println("Entre the Second no :");
//        int second = input.nextInt();
//        int result = first ^ second ;
//        System.out.println("result is :"  +result);

        // 4 Problem

//        System.out.println("Entre the First no :");
//        int num = input.nextInt();
//
//        int result = ~num ;
//        System.out.println("result is :"  +result);

        // 5 Problem

//         System.out.println("Entre the First no :");
//         int first = input.nextInt();
//         int result = first << 1;
//         System.out.println("result is :"  +result);

        // 6 Problem
        System.out.println("Check the even or odd no");
        System.out.println("Entre Number :");
        int num = input.nextInt();
        if ((num & 1)==1){
            System.out.println("Odd no");
        }else{
            System.out.println("even no");
        }

    }
}
