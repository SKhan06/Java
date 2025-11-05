package Challenge;

import java.util.Scanner;

public class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please entre a your element: ");
        int size = input.nextInt();
        int[] num =new int[size];
        int i=0;
        while (i<size){
            System.out.println("Please entre a element number : " +(i+1)+ ": ");
            num[i] =input.nextInt();
            i++;
        }
        System.out.println("Now, entre the number you want to search: ");
        int element = input.nextInt();
        int occ = Occurs(num,element);
        System.out.println("Your element was found: " + occ + " time.");
    }
    public static int Occurs(int[] num,int element){
        int occ = 0;
        for (int nums : num){
            if (nums == element){
                occ++;
            }
        }
        return occ;
    }

}
