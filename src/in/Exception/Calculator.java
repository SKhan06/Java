package in.Exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Dividing Calculator\n");
        System.out.println("Please entre a two number");
        int first = input.nextInt();
        int second = input.nextInt();
        try {
            int[] a = new int[5];
//            System.out.printf("Result is : %d",a[6]);
            a[5] = first/second;
            System.out.printf("Result is : %d",a[5]);
        }catch (ArithmeticException exception) {
            System.out.printf("%s, enter valid values", exception.getMessage());
        }catch (Throwable th){
            System.out.println("General Exception");
        }finally {
            System.out.println("I am Finally");
        }
    }
}
