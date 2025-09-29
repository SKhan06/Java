package Challenge;

import java.util.Scanner;

public class Search2dArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Search of 2d Array");
        int [][] numArr = ArrayUtility.input2dArray();
        System.out.println("Now, Entre the number you want to see ");
        int num = input.nextInt();
        boolean isfound = search(numArr,num);
        if (isfound){
            System.out.println("Number was Found" );
        }else {
            System.out.println("Number was not Found");
        }

    }

    public static boolean search(int[][] numArr , int num ){
        int i = 0;
        while (i<numArr.length){
            int j = 0;
            while (j<numArr.length){
                if (numArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }

}
