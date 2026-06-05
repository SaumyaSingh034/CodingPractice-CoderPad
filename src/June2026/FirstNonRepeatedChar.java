package June2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args){
        String str = "automation";
        findFirstNonRepeatingChar(str);
    }

    private static void findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> dataSet : dataMap.entrySet()){
            if(dataSet.getValue() ==1){
                System.out.println(dataSet.getKey());
                break;
            }
        }
    }
}
