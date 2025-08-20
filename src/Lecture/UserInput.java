package Lecture;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
//        System.out.print("Please Enter Your Name : ");
//        String name = input.nextLine();
//        System.out.println("Good Morning " + name);
//        System.out.println( name +" ,Also tell me your age ");
//        int age = input.nextInt();
//        System.out.println("Your age is : "  + age);

//        System.out.println("Entre Your Name :");
//        String name = input.nextLine();
//        System.out.println("Welcome "+name+" to KG coding");


        // Calculater//
        System.out.println("Welcome to our Calculater");
        System.out.println(" Please entre first number : ");
        int num1 = input.nextInt();
        System.out.println(" Now , Please entre second number :");
        int num2 = input.nextInt();
        int sum = num1 + num2;

        System.out.println("Sum of your number " + sum);







    }
}
