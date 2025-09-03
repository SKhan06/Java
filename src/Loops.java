import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        int a = 1;
//        while (a<=100){
//            System.out.println(a);
//            a += 1;
//        }
//        int count = 800;
//        while (count>=200){
//            System.out.println(count);
//            count -= 1;
//
//        }

        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i<5){
            int inp = input.nextInt();
            System.out.println("The Number is :" +inp);
            i += 1;
        }
    }
}
