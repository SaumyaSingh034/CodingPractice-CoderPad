package Fenruary_2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args){
        String str = "swiss";
        String[] arr = {"apple", "swiss", "test"};
        char[] arr1 = {'a','b','a','c','b'};
        System.out.println("Arrays of String :");
        firstNonRepeatingCharacterInArray(arr);
        System.out.println("Single String "+firstNonRepeatingCharacter(str));
        System.out.println(firstNonRepeatingCharacterFromCharArray(arr1));
    }

    private static char firstNonRepeatingCharacterFromCharArray(char[] arr1) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : arr1) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : arr1) {
            if(map.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';

    }

    private static void firstNonRepeatingCharacterInArray(String[] arr) {
        for(String s : arr){
            System.out.println(firstNonRepeatingCharacter(s));
        }
    }

    private static Character firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        if(str.isEmpty() || str == null)
            throw new IllegalArgumentException();
        for(char c : str.toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> dataEntry : dataMap.entrySet()){
            if(dataEntry.getValue() == 1)
                return dataEntry.getKey();
        }

        return '_';
    }
}
