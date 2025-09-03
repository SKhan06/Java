package Challenge;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to  Armstrong Number Checker ");
        System.out.println("Entre the Digit : ");
        int num = input.nextInt();

        double originalNum =armstrong(num);
        if (originalNum ==num){
            System.out.println("This is Armstrong Number");
        }else {
            System.out.println("This is not Armstrong Number");
        }



    }
    public static double armstrong(int num){
        double sum = 0;
        int digits = String.valueOf(num).length();
        while (num >0){
            int digit = num %10;
            sum += Math.pow(digit,digits);
            num /= 10;
        }
        return sum;


    }

}
