package Challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        Collections.reverse(list);
//        System.out.println(list);
        reverse(list);
    }
    public static void reverse(List<Integer> list ){
        for (int i = 0; i < list.size() - 2; i++) {
            SwapTwoNumberInArrayList.swaps(list,i,list.size()-1-i);
        }
    }


}
