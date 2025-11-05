package Challenge;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to number guessing game \n");
        int num = 5,guess;
        do {
            System.out.println("Entre guess the  number between 0 to 10: ");
            guess= input.nextInt();
        }while (num!=guess);
        System.out.println("You have successfully guessed the number");
    }
}
