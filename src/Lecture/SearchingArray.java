package Lecture;

import java.util.Scanner;

public class SearchingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 4, 56, 66, 32, 22, 43, 78, 33};
        System.out.println("Welcome to Array Search");
        System.out.println("Entre the number you want to search");
        int num = input.nextInt();
        boolean isfound = array( num,arr);
        if (isfound){
            System.out.println("Your number was found in array");
        }else {
            System.out.println("Your number was not found in array");
        }


    }

    public static boolean array(int num, int[] arr){
        int index = 0;
        while (index < arr.length){
            if (arr[index] == num ){
                return true;
            }
            index++;

        }
        return false;


    }
}
