package Challenge;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Please entre a number of element: ");
        int size = input.nextInt();
        int[] num = new int[size];
        int i=0;
        while (i<size){
            System.out.println("Please entre the element number " + (i+1)+ ": ");
            num[i]= input.nextInt();
            i++;
        }
        int maximum =max(num);
        System.out.println("Maximum number is: " + maximum);
    }

    public static int max(int[] num){
        int max = Integer.MIN_VALUE;
        for(int value:num){
            if (value>max){
                max = value;
            }
        }
        return max;

    }
}
