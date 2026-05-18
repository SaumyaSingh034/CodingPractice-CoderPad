package May2026;

import java.util.HashMap;
import java.util.Map;

public class CountOcurrences {
    public static void main(String[] args){
        String str = "automation";
        char[] ch = str.toCharArray();
        Map<Character, Integer> count = new HashMap<>();
        for(char c : ch){
            count.put(c, count.getOrDefault(c,0)+1);
        }
        System.out.println(count);
    }
}
