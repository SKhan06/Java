package Challenge;

public class ArraySumAvg {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sum and Average");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum( numArray);
        int avg = avg(numArray);
        System.out.println("Sum of the number:  " + sum);
        System.out.println("Avg of the number:  " + avg);


    }

    public static long sum(int[] numArray){
        int  i = 0;
        long sum = 0;
        while (i < numArray.length) {
            sum+= numArray[i];
            i++;
        }
        return sum;

    }


    public static int avg(int[] numArray){
        long sum = sum(numArray);
        return  (int)sum/ numArray.length;



    }
}

