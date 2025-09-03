package Practice;

import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Entre the Element no :");
        int size = input.nextInt();
        int[] num = new int[size];
        int i = 0;
        while (i <size){
            System.out.println("Please entre number of element " + (i +1)+ " :");
            num[i] = input.nextInt();
            i++;
        }
        return num;


    }
}
