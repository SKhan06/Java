package Challenge;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please entre number of element :");
        int size = input.nextInt();
        int[] num = new int[size];
        int i = 0;
        while (i< size){
            System.out.println("Please entre the element no" + (i+1) + ": ");
            num[i] =input.nextInt();
            i++;

        }
        return num;
    }

    public static void display(int[] numArray){
        int  i = 0;
        while (i< numArray.length){
            System.out.print(numArray[i] + " ");
            i++;

        }
        System.out.println();

    }
}
