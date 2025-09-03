public class Function {
    public static void main(String[] args) {
        greetUser();
        rightPyramid();
        leftPyramid();

    }

    public static void greetUser() {
        System.out.println("Hello World");
    }

    public static void rightPyramid() {
        int row = 0;
        while (row < 5) {
            System.out.print("*");
            int i = 0;
            while (i < row) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
        System.out.println();
    }

    public static void leftPyramid(){
        int row = 5;
        while (row >0){
            System.out.print("*");
            int i = 1;
            while (i<row){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row--;
        }

    }


}





