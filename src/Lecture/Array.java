package Lecture;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0]= 1;
        arr[1]= 13;
        arr[2]= 22;
        arr[3]= 34;
        arr[4]= 132;
        arr[5]= 122;
         int index = 0;

         // Array Traversal
         while (index < arr.length){
             System.out.println(arr[index]);
             index++;
         }

    }
}
