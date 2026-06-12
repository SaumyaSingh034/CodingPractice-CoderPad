package June2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstChar {
    public static void main(String[] args){
        String str = "aabbcdeef";
       System.out.println( findFirstNonRepeat(str));
    }

    private static Character findFirstNonRepeat(String str) {
        Map<Character, Integer> hashMap = new LinkedHashMap<>();
        if(str.isEmpty() || str == null){
            throw new RuntimeException();
        }
        for(char c : str.toLowerCase().toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }


        for(Map.Entry<Character, Integer> dataSet : hashMap.entrySet()){
            if(dataSet.getValue() == 1)
                return dataSet.getKey();
        }
        return '_';
    }
}
