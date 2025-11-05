package Challenge;

import java.util.Scanner;

public class LoopBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Entre your command: ");
            String command= input.next();
            if (command.equalsIgnoreCase("exits")){
                break;
            }
        }
        System.out.println("you have successfully exits. ");
    }
}
