package Lecture;

public class Array2d {
    public static void main(String[] args) {


        int [][] myArr = {{2,3,1} ,{4,3,6}, {7,8,6}};
        int i = 0;
        while (i< myArr.length){
            int j = 0;
            while (j< myArr[i].length){
                System.out.print(myArr[i][j]);
                j++;
            }
            System.out.println();
            i++;

        }
        // int[][] arr = new int[6][7];

//        arr[0][0]= 4;
//        arr[1][1]= 5;
//        arr[2][2]= 3;
//        arr[3][3]= 67;
//        arr[4][4]= 22;
//        int index = 0;
//
//        while (index< arr.length){
//            System.out.println(arr[index][index]);
//            index++;
//        }

    }






}
