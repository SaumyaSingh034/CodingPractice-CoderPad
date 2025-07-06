package CodePardFinal;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args){
        String input = "cat dog tac sat tas god dog";
        checkGroupAnagram(input);
    }

    private static void checkGroupAnagram(String input) {
        Map<String, List<String>> groupAnagram = new HashMap<>();
        String[] words = input.split("\\s+");
        for(String word : words){
            char[] ch = word.toCharArray();
            String key = new String(ch);
            Arrays.sort(ch);
            String value = new String(ch);
            groupAnagram.computeIfAbsent(value, k-> new ArrayList<>()).add(key);
        }
        for(List<String> data : groupAnagram.values()){
            System.out.println(data);
        }
    }

}
