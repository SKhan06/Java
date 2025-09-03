package Lecture.Operator;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Are you Senior (True/False) : ");
        boolean isSeniorCitizen = input.nextBoolean();
        System.out.println("Are you Adult (True/False) : ");
        boolean isAdult = input.nextBoolean();


        if (isSeniorCitizen){
            System.out.println("Hello Senior Citizen " );

        }else if (isAdult){
                System.out.println("Hello Adult");

            } else {
                System.out.println("Hello Child");
            }

    }
}
