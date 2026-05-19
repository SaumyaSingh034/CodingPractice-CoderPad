package May2026;

import java.util.HashMap;
import java.util.Map;

public class SortMapValues {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("A",3);
        map.put("B",1);
        map.put("C",2);
        map.put("E",4);

        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
