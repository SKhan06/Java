package Practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Leap Year Calculator");
        System.out.println("Entre the First Number");
        long year = input.nextInt();

        if (400%year==0 || (year % 4==0 && year % 100 !=0)){
            System.out.println("This year is Leap Year");
        }else {
            System.out.println("This is not Leap Year");
        }

    }
}
