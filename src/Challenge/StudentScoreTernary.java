package Challenge;

import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Student score \n");
        System.out.println("Entre a Marks");
        int marks = input.nextInt();
        String catagory = marks > 80? "High":(marks > 50? "Moderate":"Low");
        System.out.println(catagory);
    }

}
