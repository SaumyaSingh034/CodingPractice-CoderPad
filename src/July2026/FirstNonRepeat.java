package July2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeat {
    public static void main(String[] args){
        String str = "aabbcddeff";
        if(firstNonRepeat(str) == '_'){
            System.out.println("No unique character");
        } else{
            System.out.println(firstNonRepeat(str));
        }
    }

    private static Character firstNonRepeat(String str) {
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException("The string is null/empty");
        }
        Map<Character, Integer> hashMap = new LinkedHashMap<>();
        for(char c : str.toLowerCase().toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> data : hashMap.entrySet()){
            if(data.getValue() == 1)
                return data.getKey();
        }
        return '_';
    }
}
