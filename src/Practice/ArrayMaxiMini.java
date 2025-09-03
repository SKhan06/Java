package Practice;

import java.util.Scanner;

public class ArrayMaxiMini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Array of sum and average");
        System.out.println("Entre the no of element");
        int size = input.nextInt();
        int[] numArray = new int[size];
        int i = 0;
        while (i< numArray.length) {
            System.out.println("Entre the Element number " + (i + 1) + " :");
            numArray[i] = input.nextInt();
            i++;
        }

        int[] maxiMini = maxiMini(numArray);
        System.out.println("Maximum number : " + maxiMini[0]);
        System.out.println("Minimum number : " + maxiMini[1]);
    }

    public static int[] maxiMini(int[] numArray){
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int  i = 0 ;
        while (i<numArray.length){
            if (numArray[i]> maxi){
                maxi = numArray[i];

            }if (numArray[i]<mini){
                mini = numArray[i];

            }
            i++;
        }
        return new int[]{maxi ,mini};


    }
}
