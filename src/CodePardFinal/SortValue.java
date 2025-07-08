package CodePardFinal;

import java.util.HashMap;
import java.util.Map;

public class SortValue {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("Banana", 2);
        map.put("Apple", 5);
        map.put("Orange", 3);
        computeValue(map);
        computeKey(map);
    }

    private static void computeKey(Map<String, Integer> map) {
        map.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }

    private static void computeValue(Map<String, Integer> map) {
        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
