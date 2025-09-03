package Challenge;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Welcome to Left Half Pyramid Graph ");
        int row = 5 ;
        while (row > 0){
            System.out.print("*");
            int i = 1;
            while (i < row){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row--;
        }

    }

}
