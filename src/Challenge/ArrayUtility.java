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

    public static int[][] input2dArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please entre number of Row  :");
        int row = input.nextInt();
        System.out.println("Please entre number of Column :");
        int column = input.nextInt();
        int[][] numArray = new int[row][column];
        int i = 0;
        while (i< row){
            int j = 0;
            while (j<column){
                System.out.print("Please entre the Row no: " + (i+1) + " , Column no: " +(j +1)+ " : ");
                numArray[i][j] =input.nextInt();
                j++;
            }
            i++;

        }
        return numArray;
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
