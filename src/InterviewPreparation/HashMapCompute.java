package InterviewPreparation;

import java.lang.reflect.Array;
import java.util.*;

public class HashMapCompute {
    public static void main(String[] args){
        Map<String, List<Integer>> data = new HashMap<>();
        data.put("Saumya", Arrays.asList(20,4,7,5,1,8,19));
        data.put("Manish", Arrays.asList(30,9,7,5,1,8,19));
        data.put("Azad", Arrays.asList(29,1,3,5,1,8,19));

        sortTheHashValues(data);

    }

    private static void sortTheHashValues(Map<String, List<Integer>> data) {
     for(Map.Entry<String, List<Integer>> entry : data.entrySet()){
         List<Integer> dataList = entry.getValue();
         Collections.sort(dataList);
         System.out.println(entry.getKey()+" --> "+dataList);

     }
    }
}
