package Challenge.ArithmeticExceptionHandling;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to a Dividing Calculator\n");
        System.out.println("Entre the First number");
        int first = input.nextInt();
        System.out.println("Entre the Second number");
        int second = input.nextInt();
        try {
            int result = first/second;
            System.out.printf("result is : %d",result);
        }catch (ArithmeticException exception){
            if (exception.getMessage().equals("/ by zero")){
                System.out.println("Divided by zero occurred.");
            }else {
                throw exception;
            }
        }
    }
}
