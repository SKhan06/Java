package Challenge;

import java.util.Scanner;

public class MultiplicationNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication table ");
        System.out.println("Please entre your number");
        int num = input.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(num+ " X " +i+ " = " + num *i);

        }
    }
}
