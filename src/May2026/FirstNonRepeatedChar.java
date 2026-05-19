package May2026;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args){
        String str = "automation";

     Map<Character, Integer> map = new LinkedHashMap<>();
     for(char c : str.toCharArray()) {
         map.put(c, map.getOrDefault(c, 0) + 1);
     }
    for(Map.Entry<Character, Integer> set : map.entrySet()){
        if(set.getValue() == 1){
           System.out.println(set.getKey());
           break;
        }

    }


    }

}
