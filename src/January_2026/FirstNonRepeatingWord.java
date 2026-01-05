package January_2026;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingWord {
    public static void main(String[] args){
        String input = "automation";
        
        System.out.println(findFirstNonRepeatingWords(input));
    }

    private static Character findFirstNonRepeatingWords(String input) {
        Map<Character, Integer> dataMap = new HashMap<>();
        for(char c : input.toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }
        System.out.println(dataMap);
        for(Map.Entry<Character, Integer> d : dataMap.entrySet()){
            if(d.getValue() == 1){
                return d.getKey();
            }
        }
        return '_';
    }
}
