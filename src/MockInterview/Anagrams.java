package MockInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
    public static void main(String[] args){
        List<String> words = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art");
        groupAnagrams(words);

    }

    private static void groupAnagrams(List<String> words) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        for(String s : words){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            anagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        for(List<String> values : anagrams.values()){
            System.out.println(values);
        }
    }
}
