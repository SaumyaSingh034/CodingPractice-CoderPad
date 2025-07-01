package July;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args){
        String str = "cat dog tac sat tas god dog";
        groupAnagrams981(str);
    }

    private static void groupAnagrams981(String str) {
        String[] words = str.split("\\s+");
        Map<String, List<String>> anagrams = new HashMap<>();
        for(String s : words){
            char[] ch = s.toCharArray();
            String value = new String(ch);
            Arrays.sort(ch);
            String key = new String(ch);
            anagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(value);

        }
        for(List<String> groups : anagrams.values()){
            System.out.println(groups);
        }
    }
}
