package Challenge;

import java.util.Scanner;

public class SumFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome the Calculate the Factorial");
        System.out.println("Entre the Number : ");
        int num = input.nextInt();
        long multi = allFactorial(num);
        System.out.println("Total Factorial " + num + " is = " + multi);
    }

    public static long allFactorial(int num){
        long fact = 1;
        int i = 1;
        while (i<= num){
            fact *= i;
            i++;
        }
        return fact;

    }
}
