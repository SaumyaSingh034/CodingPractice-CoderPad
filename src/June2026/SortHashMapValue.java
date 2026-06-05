package June2026;

import java.util.HashMap;
import java.util.Map;

public class SortHashMapValue {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("API", 90);
        map.put("Selenium", 45);
        map.put("Playwright", 89);
        map.put("Java", 99);

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }
}
