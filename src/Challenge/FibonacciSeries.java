package Challenge;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series");
        System.out.println("Entre the Number : ");
        int limit = input.nextInt();
        int first = 0 , second = 1;
        while (first <= limit){
            System.out.print( first+ " ");
            int next = first + second;
            first = second;
            second = next;

        }

    }
}
