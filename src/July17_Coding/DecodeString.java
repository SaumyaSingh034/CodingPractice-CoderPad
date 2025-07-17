package July17_Coding;

import java.util.LinkedHashMap;
import java.util.Map;

public class DecodeString {
    public static void main(String[] args){
        String input = "aabbbcdd";
        countCharaterStringFrequency(input);
    }

    private static void countCharaterStringFrequency(String input) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        for(char c : input.toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> dataEntry : dataMap.entrySet())
            result.append(dataEntry.getKey()).append(dataEntry.getValue());
        System.out.println(result);
    }
}
