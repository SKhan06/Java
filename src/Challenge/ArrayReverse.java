package Challenge;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
         reverse(numArray);
        System.out.println("Your reverse array id");
        ArrayUtility.display(numArray);
    }

    public static void reverse(int[] num) {
        int i = 0;
        while (i < num.length/2){
            int swap = num[i];
            num[i]  = num[(num.length - 1) -i];
            num[(num.length - 1) -i] = swap;
            i++;
        }


    }
}
