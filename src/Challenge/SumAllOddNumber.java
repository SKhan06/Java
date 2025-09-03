package Challenge;

import java.util.Scanner;

public class SumAllOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum All Odd Number ");
        System.out.println("Entre the Number :");
        int n = input.nextInt();
        int sum = oddSum(n);
        System.out.println("Sum of Odd Number " + n + " = " + sum );

    }

    public static int oddSum(int n){
        int sum = 0;
        int i = 1;
        while (i<=n){
            if (i %2!= 0){
              sum +=i;
            }
            i++;

        }
        return sum;

    }

}
