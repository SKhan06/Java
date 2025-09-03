package Challenge;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1 Problem
          System.out.println("Calculate the Number");
//        System.out.println("Entre the Number :");
//        int isNumber = input.nextInt();
//        if (isNumber>0){
//            System.out.println("Positive");
//
//        }else if (isNumber < 0){
//            System.out.println("Negative");
//
//        }else {
//            System.out.println("zero");
//        }

        // 2 Problem

//        if(isNumber<0){
//            System.out.println("Number must be greater than zero");
//        } else if ( isNumber%2==0){
//
//            System.out.println("Even Number");
//
//        }else {
//            System.out.println("Odd Number");
//        }


        // 3 Problem

//        System.out.println("Entre the First no:");
//        int num1 = input.nextInt();
//        System.out.println("Entre the Second no:");
//        int num2 = input.nextInt();
//        System.out.println("Entre the Second no:");
//        int num3 = input.nextInt();
//        int greatest;
//
//        if (num1>=num2 && num1>=num3){
//            greatest = num1;
//        } else if (num2>=num1 && num2>=num3){
//            greatest = num2;
//        }else {
//            greatest = num3;
//        }
//        System.out.println("The greatest no : "  + greatest);

        // 4 Problem
//        System.out.println("Entre the Number :");
//        int year = input.nextInt();
//        if (year %400==0 ||(year %4==0&& year % 100 !=0) ){
//            System.out.println("leap year");
//        }else {
//            System.out.println("Not a leap year");
//        }


        // 5 Problem

//        System.out.println("Please entre your Percentage :");
//        int percentage = input.nextInt();
//        if (percentage >= 90){
//            System.out.println("Grade A");
//        }else if (percentage >= 75){
//            System.out.println("Grade B");
//        } else if (percentage >=60) {
//            System.out.println("Grade C");
//        } else if (percentage >= 30) {
//            System.out.println("Grade D");
//        }else {
//            System.out.println("Fail");
//        }


        // 6 Problem
        System.out.println("Please entre your age :");
        int age = input.nextInt();
        if (age < 13 ){
            System.out.println("Child");
        }else if (age <20 ){
            System.out.println("Teen");
        } else if (age < 60) {
            System.out.println("Adult");
        } else if (age > 60 ) {
            System.out.println("Senior");
        }else {

        }
    }
}
