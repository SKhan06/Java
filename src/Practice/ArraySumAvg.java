package Practice;

public class ArraySumAvg {
    public static void main(String[] args) {
        System.out.println("Welcome to Array the Sum and Average");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        long avg = avg(numArray);
        System.out.println("Sum of the no :" +sum);
        System.out.println("Avg of the no :" +avg);

    }

    public static long sum(int[] numArray){
        int i = 0;
        int sum = 0;
        while (i<numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;

    }

    public static int avg(int[] numArray){
        long sum  = sum(numArray);
        return (int)sum/ numArray.length;

    }
}
