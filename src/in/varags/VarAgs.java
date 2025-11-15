package in.varags;

public class VarAgs {
    public static void main(String... args) {
//        System.out.println(sum(new int[]{4,3,3}));
        System.out.println(sum(6,7 ,8,9,5,4,7));

    }
    public static int sum(int first,int second,int... a){
        int sum = 0;
        for (int i : a) {
            sum +=i;
        }
        return sum;
    }

    }
//    public static int sum(int[] a){
//        int sum = 0;
//        for (int i : a) {
//            sum +=i;
//        }
//        return sum;
//    }

