package Practice;

public class Pattern {
    public static void main(String[] args) {
        int i = 0;
        while (i<5){
            System.out.print("*");
            int j = 0;
            while (j<i){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;

        }
        System.out.println();

        int a =5;
        while (a>0){
            System.out.print("*");
            int b = 1;
            while (b<a){
                System.out.print(" *");
                b++;
            }

            System.out.println();
            a--;

        }
    }
}
