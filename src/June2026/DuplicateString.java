package June2026;

import java.nio.charset.UnmappableCharacterException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateString {
    public static void main(String[] args){
        String str = "programming";
        findDuplicateString(str);
    }

    private static void findDuplicateString(String str) {
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException();
        }
        HashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        }

        //Iterating

        for(Map.Entry<Character, Integer> dataSet : hashMap.entrySet()){
            if(dataSet.getValue()>1){
                System.out.println(dataSet.getKey()+" = "+dataSet.getValue());
            }
        }

    }
}
