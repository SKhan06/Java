package Challenge;

import java.util.Scanner;

public class SumPositive {
    public static void main(String[] args) {
        System.out.println("Welcome to adding positive number. ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please entre a your element: ");
        int size = input.nextInt();
        int[] num =new int[size];
        int i=0;
        while (i<size){
            System.out.println("Please entre a element number : " +(i+1)+ ": ");
            num[i] =input.nextInt();
            i++;
        }
        int sum = 0;
        for (int nums:num){
            if (nums<0){
                continue;
            }
            sum += nums;
        }
        System.out.println("The sum of positive number is: "+sum);
    }
}
