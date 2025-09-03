package Challenge;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum of LCM Calculator ");
        System.out.println("Entre the First No : ");
        int first = input.nextInt();
        System.out.println("Entre the Second No : ");
        int second  = input.nextInt();
        int sum = lcm(first,second);
        System.out.println("Sum of LCM " + sum);

    }

    public static int lcm(int first , int second){
        int i = 1;
       while (i <= second ){
       int fact = i * first;
       if (fact % second == 0){
           return fact;
            }
            i++;
       }
       return i;

        }
    }


