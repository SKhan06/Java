package Practice;

import java.util.Scanner;

public class MaxiMini {
    public static void main(String[] args) {
        System.out.println("Welcome to the Array of Maximum and Minimum");
        Scanner input = new Scanner(System.in);
        System.out.println("Please entre the no of Element : ");
        int size = input.nextInt();
        int[] num = new int[size];
        int i = 0;
        while (i<size){
            System.out.println("Entre the element of no "+ (i+1)+ " :");
            num[i] = input.nextInt();
            i++;
        }

        int[] maxMini = maxiMini(num);
        System.out.println("Minimum value " + maxMini[0]);
        System.out.println("Maximum value " + maxMini[1]);



    }

    public static int[] maxiMini(int[] num) {
        int max = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        int i = 0;
        while (i < num.length) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < mini) {
                mini = num[i];
            }
            i++;
        }
        return new int[]{mini, max};
    }
}
