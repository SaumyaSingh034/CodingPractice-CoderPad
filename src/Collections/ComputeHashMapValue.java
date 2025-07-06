package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeHashMapValue {
    public static void main(String[] args){
        Map<String, Integer> data = new HashMap<>();
        data.put("ABC", 98);
        data.put("TRY", 81);
        data.put("OPI", 76);
        data.put("TYR", 34);
        data.put("FDE", 66);
        data.put("MNB", 87);
        data.put("XCC", 99);

        sortMapValue(data);
    }

    private static void sortMapValue(Map<String, Integer> data){
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(data.entrySet());
        sortedList.sort(Map.Entry.comparingByValue());
        System.out.println(sortedList);

        for(Map.Entry<String, Integer> dataMap : sortedList){
            System.out.println(dataMap.getKey()+" --> "+dataMap.getValue());
        }
    }
}
