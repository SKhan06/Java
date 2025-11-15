package in.Collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Sohail");
        strList.add("Alam");
        strList.add(0,"Muhammad");
        strList.remove(2);
        if (strList.contains("Sohail")){
            System.out.println("Sohail exists");
        }
        for (int i = 0; i<strList.size();i++){
            System.out.println(strList.get(i));
        }
        for (String str : strList){
            System.out.println(str);
        }
        System.out.println(strList);

    }
}
