package PracticeCoding;

import java.util.*;

public class Anagram12 {
    public static void main(String[] args){
        String str = "cat act tac god odg bat atb dog try yrt rty";
        anagram123(str);
    }

    private static void anagram123(String str) {
        Map<String, List<String>> dataMap = new HashMap<>();
        String[] words = str.split("\\s+");
        for(String s : words){
            char[] ch = s.toCharArray();
            String value = new String(ch);
            Arrays.sort(ch);
            String data = new String(ch);
            dataMap.computeIfAbsent(data, k -> new ArrayList<>()).add(value);
        }

        for(List<String> word : dataMap.values()){
            System.out.println(word);
        }
    }
}
