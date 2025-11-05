package Challenge;

import java.util.Scanner;

public class RecursionFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series: ");
        System.out.print("Entre a number: ");
        int num = input.nextInt();
        for (int i =1; i<=num;i++){
            System.out.println(fibonacci(i)+ "");
        }
    }

    public static int fibonacci(int num){
        if (num == 1){
            return 0;
        }
        if (num ==2){
            return 1;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }
}
