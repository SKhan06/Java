package Challenge;

import java.util.Scanner;

public class PrimeFor {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to prime number checker");
        System.out.println("Entre your Number");
        int num = input.nextInt();
        System.out.println("Your Number is "+ (isPrime(num) ? "Prime": "not Prime"));
    }
    public static boolean isPrime(int num){
        for (int i =2; i<num; i++){
            if (num%i==0){
                return false;
             }
        }
        return true;
    }
}
