package Practice;

import java.util.Scanner;

public class ArrayDelete {
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
        System.out.println("Entre the number was found : ");
        int num = input.nextInt();
        int occ = occ(numArray, num);
        System.out.println("Number was found  " + occ);
        int[] newArray = delete(numArray,num);
        System.out.println("After the deleting number " + newArray );
        for (int val :newArray){
            System.out.print(val + "");
        }
    }

    public static int occ(int[] numArray , int num){
        int i = 0;
        int occ = 0;
        while (i < numArray.length){
            if (numArray[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
    public static int[] delete(int[] numArray , int num){
        int occ = occ(numArray ,num);

        int[] arr = new int[numArray.length - occ];
        int j = 0;
        for (int i = 0;i<numArray.length; i++){
            if (numArray[i] != num){
                arr[j] = numArray[i];
                j++;
            }
        }
        return arr;
    }


}
