package LinkedInCoading;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringTransformation {
    public static void main(String[] args){
        String input = "tomorrow";
        transformTheString(input);
    }

    private static void transformTheString(String input) {
        Map<Character, Integer> inputChar = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();
        for(char c : input.toCharArray())
            inputChar.put(c, inputChar.getOrDefault(c, 0)+1);
        for(Map.Entry<Character, Integer> inputEntrySet : inputChar.entrySet()){
            if(inputEntrySet.getValue() > 1){
                result.append(inputEntrySet.getKey()).append(inputEntrySet.getValue());
            }else{
                result.append(inputEntrySet.getKey());
            }
        }
        System.out.println(result);
    }
}
