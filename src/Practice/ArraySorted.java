package Practice;

public class ArraySorted {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        boolean ascending = true;
        boolean decending = true;

        int i = 0;

        while (i < numArray.length -1){
            if (numArray[i] > numArray[i+1]){
                 ascending = false;
            }
            i++;
        }
        while (i<numArray.length -1){
            if (numArray[i] < numArray[i+1]){
                decending = false;
            }
            i++;

        }

        if (ascending){
            System.out.println("The array is sorted in ascending order  ");
        }else if (decending){
            System.out.println("The array is sorted in decending order ");
        }else {
            System.out.println("The array is not sorted.");
        }


    }
}

