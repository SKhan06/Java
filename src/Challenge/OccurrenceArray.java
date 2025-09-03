package Challenge;

import java.util.Scanner;

public class OccurrenceArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Occurrence Array");
        int[] numArray = ArrayUtility.inputArray();
        System.out.println("entre the number was found :");
        int num = input.nextInt();
        int occurrence = Occurrence( numArray, num);
        System.out.println("Your number was founded : " + occurrence);
    }

    public static int Occurrence(int[] numArray, int num){
        int i = 0;
        int occ = 0;
        while (i<numArray.length){
            if (numArray[i] == num) {
                occ++;
            }
            i++;

        }
        return occ;

    }
}
