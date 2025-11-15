package Challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapTwoNumberInArrayList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,5,6,3,8,9,29,21,34,2,98);
        swap(list);
        System.out.println(list);
        swaps(list,2,7);
        System.out.println(list);

    }
    public static void swap(List<Integer> integers){
          Collections.swap(integers,0,4);
    }
    public static void swaps(List<Integer> list,int x,int y){
        int swap = list.get(x);
        list.set(x, list.get(y));
        list.set(y,swap);
    }
}
