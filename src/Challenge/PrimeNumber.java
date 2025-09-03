package Challenge;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker");
        System.out.println("Entre the Number : ");
        int num = input.nextInt();
        boolean prime = isPrime(num);
        if (prime){
            System.out.println("This is Prime Number");
        }else {
            System.out.println("This is not Prime Number");
        }

    }

    public static boolean isPrime(int num){
        int i = 2;
        while (i<num){
            if (num % i ==0){
                return false;
            }
            i++;

        }
        return true;
    }
}
