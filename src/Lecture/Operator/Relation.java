package Lecture.Operator;

import java.util.Scanner;

public class Relation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Driving Licence Portal");
        System.out.println("Entre your age : ");
        int age = input.nextInt();
        if( age >= 18){
            System.out.println("Your are eligible to driving");
        }else {
            System.out.println("Your are not eligible to driving");
        }
    }
}
