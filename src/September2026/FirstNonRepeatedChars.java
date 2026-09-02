package September2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChars {
    public static void main(String[ ] args){
        String str1 = "swiss";
        System.out.println(findFirstNonRepeatingChar1(str1));
        System.out.println(findFirstNonRepeatingChar1("aabbccde"));
    }

    private static Character findFirstNonRepeatingChar1(String str1) {
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        if(str1 == null || str1.isEmpty()){
            throw new IllegalArgumentException();
        }
        for(Character c : str1.toLowerCase().toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> dataSet : dataMap.entrySet()){
            if(dataSet.getValue() == 1)
                return dataSet.getKey();
        }
        return null;
    }
}
