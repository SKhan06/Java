package Practice;

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Array of sum and average");
        System.out.println("Entre the no of element");
        int size = input.nextInt();
        int[] numArray = new int[size];

        int i = 0;
        while (i< numArray.length){
            System.out.println("Entre the Element number " + (i+1) + " :");
            numArray[i] = input.nextInt();
            i++;
        }

        int sum = sum(numArray);
        double avg = avg(numArray);
        System.out.println("Sum is : " + sum);
        System.out.println("Avg is : " + avg);
    }

    public  static  int sum(int[] numArray){
        int i = 0;
        int sum = 0;
        while (i< numArray.length){
            sum += numArray[i];
            i++;

        }
        return sum;
    }

    public static double avg(int[] numArray){
        int sum = sum(numArray);
        return sum/numArray.length;

    }
}
