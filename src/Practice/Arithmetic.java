package Practice;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Calculator");
        System.out.println("Entre the First Number");
        int first = input.nextInt();
        System.out.println("Entre the Second Number");
        int second = input.nextInt();
        int sum = first + second;
        System.out.println(sum);
        System.out.println(first- second);
        System.out.println(first * second);
        System.out.println(first % second);
        System.out.println(first / second);

    }
}
