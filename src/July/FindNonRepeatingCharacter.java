package July;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindNonRepeatingCharacter {
    public static void main(String[] args){
        String s = "automation";
        String[] arr = {"java", "python", "typescript"};
        char[] data = {'a','e','i','o','u','e','i','u','a'};

        System.out.println("String Result: "+findNonRepeatingChar44(s.toCharArray()));
        System.out.println("String Array Result : "+findRepeatingCharUsingArray(arr));
        System.out.println("Char Array Result : "+ findNonRepeatingChar44(data));
    }

    private static List<Character> findRepeatingCharUsingArray(String[] arr) {
        List<Character> charData = new ArrayList<>();
        for(String s : arr){
           charData.add( findNonRepeatingChar44(s.toCharArray()));
        }
        return charData;

    }

    private static char findNonRepeatingChar44(char[] charArray) {
        Map<Character, Integer> unique = new LinkedHashMap<>();
        for(char c : charArray){
            unique.put(c, unique.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> dataEntry : unique.entrySet()){
            if(dataEntry.getValue() == 1){
                return dataEntry.getKey();
            }
        }
        return '_';

    }
}
