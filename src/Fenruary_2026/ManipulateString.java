package Fenruary_2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class ManipulateString {
    public static void main(String[] args){
        String str = "Automation";
        manipulateString(str);
    }

    private static void manipulateString(String str) {
        Map<Character, Integer> data = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();
        for(char c : str.toLowerCase().toCharArray()){
            data.put(c, data.getOrDefault(c,0)+1);
        }

        for(char c : str.toLowerCase().toCharArray()){
            if(data.get(c) > 1){
                result.append(data.get(c));
            }else
                result.append(c);
        }
        System.out.println(result);

    }
}
