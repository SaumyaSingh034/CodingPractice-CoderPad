package July;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args){
        String str = "automationcoding";
        countCharactersInString(str);
    }

    private static void countCharactersInString(String str) {
        if(str.isEmpty() || str == null)
            throw new IllegalArgumentException("String is either null or empty");
        Map<Character, Integer> data = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            data.put(c, data.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> dataEntry : data.entrySet()){
            System.out.println(dataEntry.getKey()+" --> "+dataEntry.getValue());
        }
    }
}
