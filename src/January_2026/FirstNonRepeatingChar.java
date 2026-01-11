package January_2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args){
        String str = "swiss";
       System.out.println( firstNonRepeatingChar(str));
    }

    private static Character firstNonRepeatingChar(String str) {
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        for(char c : str.toCharArray())
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        return dataMap.entrySet().stream()
                .filter(e -> e.getValue() ==1)
                .map(Map.Entry::getKey)
                .findFirst().orElse('_');
    }

}
