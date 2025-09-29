package Challenge;

import java.util.Scanner;

public class Array2dSumAvg {
    public static void main(String[] args) {
        System.out.println("Welcome to the Search of 2d Array");
        int [][] numArr = ArrayUtility.input2dArray();
        int sum = sum(numArr);
        double avg = average(numArr);

        System.out.println("Average Number is : " +sum);
        System.out.println("Average Number is :" + avg);

    }

    public static int sum(int[][] numArr){
        int  i = 0;
        int sum = 0;
        while (i<numArr.length){
            int  j = 0;
            while (j<numArr[0].length){
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static int average(int[][] numArr){
        if (numArr.length == 0) {
            return 0;
        }
        int row = numArr.length;
        int colm = numArr[0].length;
        int sum = row * colm;
        return sum(numArr)/sum;

    }
}
