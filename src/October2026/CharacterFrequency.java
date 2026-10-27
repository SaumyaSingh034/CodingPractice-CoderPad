package October2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args){
        String str = "I love java coding and working in Goldman Sachs";
        countCharacterFrequency(str.replace(" ","").toCharArray());
    }

    private static void countCharacterFrequency(char[] s) {
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        for(char c : s){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> dataSet : dataMap.entrySet()){
            System.out.println(dataSet.getKey() +" -------> "+dataSet.getValue());
        }
    }
}
