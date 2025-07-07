package CodePardFinal;

import java.util.HashMap;
import java.util.Map;

public class FindMinValue {
    public static void main(String[] args){
        Map<String, Integer> data = new HashMap<>();
        data.put("Saumya", 98);
        data.put("Anuj", 76);
        data.put("Virat", 18);
        findMinValue(data);
    }

    private static void findMinValue(Map<String, Integer> data) {
        int min = Integer.MAX_VALUE;
        for(int i : data.values()){
            if(min > i)
                min = i;
        }

        for(Map.Entry<String, Integer> dataSet : data.entrySet()){
            if(dataSet.getValue() == min){
                System.out.println(dataSet.getKey()+" ----> "+dataSet.getValue());
            }
        }

    }
}
