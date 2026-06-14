package June2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindLastNonRepeatingChar {
    public static void main(String[] args){
        String str = "automation";
        findLastNonRepatingChar12(str);
    }

    private static void findLastNonRepatingChar12(String str) {
        Map<Character, Integer> data = new LinkedHashMap<>();
        char lastChar = ' ';
        for(char c: str.toLowerCase().toCharArray()){
            data.put(c, data.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> dataSet : data.entrySet()){
            if(dataSet.getValue() == 1){
                lastChar = dataSet.getKey();
            }
        }
        System.out.println(lastChar);
    }
}
