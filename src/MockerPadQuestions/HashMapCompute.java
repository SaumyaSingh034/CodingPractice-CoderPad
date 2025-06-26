package MockerPadQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapCompute {
    public static void main(String[] args){
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("Saumya", 19);
        dataMap.put("Hemant", 8);
        dataMap.put("Mandar", 41);
        dataMap.put("Yuni", 22);
        dataMap.put("Pop", 31);
        sortByValues(dataMap);
    }

    private static void sortByValues(Map<String, Integer> dataMap) {
       List<Map.Entry<String, Integer>> dataList = new ArrayList<>(dataMap.entrySet());
       dataList.sort(Map.Entry.comparingByValue());
       for(Map.Entry<String, Integer> entry : dataList){
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
    }
}
