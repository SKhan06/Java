package Challenge;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Merge two Sorted Array");
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] merge = merge(arr1 , arr2);
        System.out.println("Your number is Merged");
        ArrayUtility.display(merge);

    }

    public static int[] merge(int[] arr1 , int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i = 0 , j = 0, k = 0;
        while (i< arr1.length && j<arr2.length ){
            if (arr1[i] < arr2[j]){
                newArr[k] = arr1[i];
                i++;
                k++;
            }else {
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }
          while (i< arr1.length){
              newArr[k] = arr1[i];
              i++;
              k++;
          }

          while (j< arr2.length){
              newArr[k] = arr2[j];
              j++;
              k++;
          }

        return newArr;

    }
}
