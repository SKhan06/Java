package Challenge;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " = " + gcd);

    }

    public static int findGCD(int a , int b){
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;


    }

}
