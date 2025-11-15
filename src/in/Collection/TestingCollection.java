package in.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestingCollection {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(12);
        numList.add(13);
        numList.add(17);
        numList.add(8);
        numList.add(-87);
        numList.add(5);
        Utility.print(numList);
        Collections.sort(numList);
        Utility.print(numList);
       Collections.reverse(numList);
        Utility.print(numList);

        List<Integer> unmodifiable = Collections.unmodifiableList(numList);
        unmodifiable.add(9);
        Utility.print(numList);
    }
}
