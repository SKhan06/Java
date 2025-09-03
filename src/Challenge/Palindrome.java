package Challenge;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Number Checker ");
        System.out.println("Entre the Digit : ");
        int num = input.nextInt();
        boolean total = palindromeNumber(num);
        if (total){
            System.out.println("Your number is Palindrome : " + num);
        }else {
            System.out.println("Your number is not Palindrome : " + num );

        }

    }

    public static boolean palindromeNumber(int num){
        int original =num;
        int reverse = 0;
        while (num >0){
            int digit = num %10;
            reverse = reverse * 10 +digit;
            num /= 10;



        }
        return reverse == original;

    }

}
