package in.Map;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Sohail",77);
        map.put("Yeshu",89);
        map.put("Irfan",99);
        map.put("Lucky",100);
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get("Lucky"));
        System.out.println(map.remove("Sohail"));
        for (String key :map.keySet()) {
            System.out.printf(" %s %s ",key,map.get(key));
        }
    }
}
