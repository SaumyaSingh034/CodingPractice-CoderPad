package October2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args){
        String str = "swiss";
       System.out.println( printNonRepeatedCharacter(str));
        System.out.println(printNonRepeatedCharacter("swiss"));   // w
        System.out.println(printNonRepeatedCharacter("aabbc"));   // c
        System.out.println(printNonRepeatedCharacter("aabb"));    // NUL
        System.out.println(printNonRepeatedCharacter("aAbB"));
    }

    private static char printNonRepeatedCharacter(String str) {

        if(str == null || str.isEmpty())
            return '\0';
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        for(char c : str.toLowerCase().toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> dataEntry : dataMap.entrySet()){
            if(dataEntry.getValue() == 1)
                return dataEntry.getKey();
        }
        return '\0';
    }
}
