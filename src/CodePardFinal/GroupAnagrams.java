package CodePardFinal;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] arsgs){
        String[] words = {"cat", "dog", "tac", "sat", "tas", "god", "dog"};
        checkGroupAnagrams(words);
    }

    private static void checkGroupAnagrams(String[] words) {
        Map<String, List<String>> data = new HashMap<>();
        for(String word : words){
            char[] ch = word.toCharArray();
            String value = new String(ch);
            Arrays.sort(ch);
            String key = new String(ch);
            data.computeIfAbsent(key, k-> new ArrayList<>()).add(value);
        }

        for(List<String> d : data.values()){
            System.out.println(d);
        }
    }
}
