package July16_Coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortMapValues {
    public static void main(String[] args){
        Map<String, Integer> data = new HashMap<>();
        data.put("ABC",34);
        data.put("BYU",24);
        data.put("MNB",77);
        data.put("IOO",4);
        data.put("PLK",3);
        data.put("MNF",12);
        sortMapOnBasedOfValues(data);
    }

    private static void sortMapOnBasedOfValues(Map<String, Integer> data) {
        List<Map.Entry<String, Integer>> listMap = new ArrayList<>(data.entrySet());
        listMap.sort(Map.Entry.comparingByValue());
        System.out.println(listMap);
    }
}
