package Challenge;

public class TwoDiagonalSum {
    public static void main(String[] args) {
        System.out.println("Welcome to  the sum of two diagonal Calculator");
        int[][] numArr = ArrayUtility.input2dArray();
        long dia = SumOfDiagonal(numArr);
        System.out.println("Sum of the Two Diagonal : " + dia);
    }

    public static long SumOfDiagonal(int[][] numArr){
        long leftSum = LeftDiagonal(numArr);
        long rightSum = RightDiagonal(numArr);
        long sum = leftSum + rightSum;
        if (numArr.length % 2 !=0){
            int index = numArr.length/2;
            sum -= numArr[index][index];
        }
        return sum;
    }
    public static long LeftDiagonal(int[][] numArr){
        int i = 0;
        int sum = 0;
        while (i< numArr.length){
            sum += numArr[i][i];
            i++;
        }
        return sum;
    }
    public static long RightDiagonal(int[][] numArr){
        int i = 0;
        int sum = 0;
        while (i< numArr.length){
            int col = numArr.length -1 -i;
            sum += numArr[i][col];
            i++;
        }
        return sum;
    }
}
