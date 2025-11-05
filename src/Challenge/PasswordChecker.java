package Challenge;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Set password \n");
        String password;
        do {
            System.out.println("Entre your password");
            password= input.next();
        }while (!isValidPassword(password));
        System.out.println("Your password is: "+password);
    }

    public static boolean isValidPassword(String password){
        return password.length()>6;

    }
}
