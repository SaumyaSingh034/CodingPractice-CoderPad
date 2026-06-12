package June2026;

import java.util.HashMap;
import java.util.Map;

public class SortHashMapValues {
    public static void main(String[] args){
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("Dhoni", 7);
        dataMap.put("Virat", 18);
        dataMap.put("Rohit", 1);
        dataMap.put("Jadega", 28);
        dataMap.put("Samsung", 35);
        dataMap.put("Rajat Patidar", 89);

        dataMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

}
