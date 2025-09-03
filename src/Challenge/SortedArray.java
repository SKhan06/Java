package Challenge;

import java.util.Scanner;

public class SortedArray {
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
        boolean sortIn =sortedIncreasing(num);
        boolean sortDe = sortedDecreasing(num);
        System.out.println("Increasing order? " + sortIn);
        System.out.println("Decreasing order? " + sortDe);

    }




    public static boolean sortedIncreasing(int[] num){
        int i = 0;
        while (i< num.length-1){
            if (num[i]> num[i +1]){
                return false;
            }
            i++;

        }
        return true;

    }
    public static boolean sortedDecreasing(int[] num){
        int i =0;
        while (i<num.length -1){
            if (num[i]< num[i+1]){
                return false;
            }
            i++;
        }
        return true;

    }
}
