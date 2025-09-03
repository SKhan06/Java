package Challenge;

import java.util.Scanner;

public class RightHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Welcome to  Right Half Pyramid Graph ");
        int row = 0;
        while (row < 5){
            System.out.print("*");
            int i = 0;
            while (i < row){
                System.out.print( " *");
                i++;
            }
            System.out.println();
            row++;

        }

    }
}
