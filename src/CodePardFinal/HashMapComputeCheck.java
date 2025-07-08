package CodePardFinal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;

public class HashMapComputeCheck {
    public static void main(String[] args) {
        Map<String, Integer> data = new LinkedHashMap<>();
        data.put("ABC", 87);
        data.put("YTG", 12);
        data.put("KJH", 2);
        data.put("KHH", 88);
        computeCheck(data);
    }

    private static void computeCheck(Map<String, Integer> data) {
        List<Map.Entry<String, Integer>> listData = new ArrayList<>(data.entrySet());
        listData.sort(Map.Entry.comparingByValue());
        for(Map.Entry<String, Integer> d : listData){
            System.out.println(d.getKey()+" --> "+d.getValue());
        }
    }
}
