package Challenge;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum of Digit Calculator ");
        System.out.println("Entre the Digit :");
        int num = input.nextInt();
        int all = sumDigit(num);
        System.out.println("Sum of the Total Digit " + num + "=" +all);

    }

    public static int sumDigit(int num){
        int sum = 0;
        while (num >0){
            int digit = num % 10;
            sum+= digit;
            num /= 10;

        }
        return sum;
    }




}
