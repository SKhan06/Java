package Practice;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GreatestNumber Calculator");
        System.out.println("Entre the First Number");
        int num1 = input.nextInt();
        System.out.println("Entre the Second  Number");
        int num2 = input.nextInt();
        System.out.println("Entre the third Number");
        int num3 = input.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("The Greatest Number is " + num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("The Greatest Number is " + num2);
        }
        else {
            System.out.println("The Greatest Number is " + num3);
        }


    }
}
