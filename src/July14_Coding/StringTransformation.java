package July14_Coding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringTransformation {
    public static void main(String[] args){
        String str = "tomorrow";
        stringTransformationCheck(str);
    }

    private static void stringTransformationCheck(String str) {
        Map<Character, Integer> data = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            data.put(c, data.getOrDefault(c, 0)+1);
        }
       for(char c : str.toCharArray()){
           int count = data.get(c);
           if(count>1)
               sb.append(count);
           else
               sb.append(c);
       }
       System.out.println(sb);
    }
}
