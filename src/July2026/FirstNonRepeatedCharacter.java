package July2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args){
        String str = "automation";
        System.out.println(findFirstNonRepeated(str));
        System.out.println(findLastNonRepeated(str));
    }

    private static Character findLastNonRepeated(String str) {
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        char value = ' ';
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException();
        }
        for(Character c : str.toLowerCase().toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character,Integer> dataSet : dataMap.entrySet()){

            if(dataSet.getValue() == 1) {
                value = dataSet.getKey();
            }
        }
        return value;
    }

    private static Character findFirstNonRepeated(String str) {
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException();
        }
        for(Character c : str.toLowerCase().toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character,Integer> dataSet : dataMap.entrySet()){
            if(dataSet.getValue() == 1) {
                return dataSet.getKey();
            }

        }
        return '_';
    }
}
