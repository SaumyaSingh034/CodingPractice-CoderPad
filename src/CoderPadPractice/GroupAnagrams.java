package CoderPadPractice;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args){
        String input = "cat dog tac sat tas god dog";
        printGroupsAnagram123(input);
    }

    private static void printGroupsAnagram123(String input) {
        String[] words = input.split("\\s+");
        Map<String, List<String>> anagrams = new LinkedHashMap<>();

        for(String word : words){
            char[] ch = word.toCharArray();
            String value = new String(ch);
            Arrays.sort(ch);
            String key = new String(ch);
            anagrams.computeIfAbsent(key, k-> new ArrayList<>()).add(value);
        }
        for(List<String> ana : anagrams.values()){
            System.out.print(ana+" ");
        }
    }
}
