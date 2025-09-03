package Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array of Delete the number");
        int[] numArray = ArrayUtility.inputArray();
        System.out.println("Entre the found number");
        int num = input.nextInt();
        int occ = found(numArray,num);
        System.out.println("Your Number was Found : " +occ);
        int[] newArray = delete(numArray, num);

        System.out.print("Array after deletion: "  + Arrays.toString(newArray));



    }
    public static int found(int[] numArray , int num) {
        int i = 0;
        int occ = 0;
        while (i < numArray.length) {
            if (numArray[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }

    public static int[] delete(int[] numArray, int num){
        int occ = found( numArray ,num );

        int[] newArray = new int[numArray.length -occ];
         int j= 0;
         for (int i= 0; i< numArray.length; i++ ){
             if (numArray[i] != num){
                 newArray[j] = numArray[i];
                 j++;
             }
         }
        return newArray;

    }


}
