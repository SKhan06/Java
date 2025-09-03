package Practice;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to PPositiveNegative Calculator");
        System.out.println("Entre the  Number");
        int num = input.nextInt();

        if (num>0){
            System.out.println("Positve");
        }else if (num<0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }

    }


}
