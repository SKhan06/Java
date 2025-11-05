package Challenge;

import java.util.Scanner;

public class RecursionPalindrome {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Palindrome Number Checker ");
            System.out.println("Entre the Digit : ");
            String str = input.next();
            System.out.println("Your string is " + ((palindromeNumber(str) ? "Palindrome" : "Not Palindrome")));

        }

        public static boolean palindromeNumber(String str){
            if (str.length()<=1){
                return true;
            }
            int lastPos = str.length()-1;
            if (str.charAt(0) != str.charAt(lastPos)){
                return false;
            }
            String newStr = str.substring(1,lastPos);
            return palindromeNumber(newStr);






        }

    }


