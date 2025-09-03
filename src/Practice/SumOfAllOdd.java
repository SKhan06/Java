package Practice;

import java.util.Scanner;

public class SumOfAllOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GreatestNumber Calculator");
        System.out.println("Entre the  Number");
        int num = input.nextInt();
        int i = 1;
        int sum = 0;
        while (i<num){
            if (i%2 !=0){
                sum+=i;
            }
            i++;
        }
        System.out.println("Sum of Odd Number " + num + " = " + sum);

    }



}
