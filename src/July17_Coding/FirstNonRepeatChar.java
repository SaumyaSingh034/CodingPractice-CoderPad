package July17_Coding;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatChar {
    public static void main(String[] args){
        String str = "aabbccdeff";
        System.out.println(findFirstNonRepeatChar(str));
    }

    private static char findFirstNonRepeatChar(String str) {
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        for(char c : str.toCharArray())
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        for(Map.Entry<Character, Integer> dataEntry : dataMap.entrySet()){
            if(dataEntry.getValue() == 1)
                return dataEntry.getKey();
        }
        return '_';

    }
}
