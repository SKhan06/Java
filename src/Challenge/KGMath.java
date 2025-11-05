package Challenge;

public class KGMath {
    public static void main(String[] args) {
        System.out.println(Math.abs(-123));
        System.out.println(Math.ceil(5.07));
        System.out.println(Math.floor(5.07));
        System.out.println(Math.round(5.66));
        System.out.println(Math.PI);


        for (int i = 0; i < 10; i++) {
            long round =  Math.round(Math.random()*100);
            System.out.println(round);


        }
    }
}
