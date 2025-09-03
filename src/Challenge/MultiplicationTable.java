package Challenge;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome to Multiplication World\n");
//        table();
        Scanner input = new Scanner(System.in);
        System.out.print("Entre the Number : ");
        int num = input.nextInt();
        newTable(num);

    }
    public static void table(){
    Scanner input = new Scanner(System.in);
        System.out.print("Entre the Number : ");
    int num = input.nextInt();
    int i = 1;
        while (i <= 10){
        System.out.println(num+ "x" + i + "="+(num*i));
        i++;

        }
    }

    public static void newTable( int num){
        int i = 1;
        while (i <= 10){
            System.out.println(num + "x" + i + "=" +(num *i));
            i++;

        }

    }
}
