package Fenruary_2026;

import java.util.HashMap;
import java.util.Map;

public class SortMapValue {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 1);
        map.put("C", 2);

        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
