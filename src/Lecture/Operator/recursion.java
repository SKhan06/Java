package Lecture.Operator;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Entre your Number");
        int num = input.nextInt();
        long fact = FactorialIterate(num);
        long facto = Factorial(num);
        System.out.println("Factorial is:" +fact);



    }
    public static long Factorial(int num){
       if(num ==1){
           return 1;
       }
       return num * Factorial(num-1);

    }
    public static long FactorialIterate(int num){
        long result = 1;
        for (int i=1;i<=num;i++){
            result *=i;
        }
        return result;

    }
}
