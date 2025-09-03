package Practice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GreatestNumber Calculator");
        System.out.println("Entre the  Number");
        int num = input.nextInt();
        int i = 1;
        while (i <=10){
            System.out.println(num + "x" + i +"=" +(num * i));
            i++;

        }
    }
}
