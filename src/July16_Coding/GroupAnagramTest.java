package July16_Coding;

import java.util.*;

public class GroupAnagramTest {
    public static void main(String[] args){
         String input = "cat dog tac sat tas god dog";
         checkAnagramsTest(input);
    }

    private static void checkAnagramsTest(String input) {
        Map<String, List<String>> anagrams = new LinkedHashMap<>();
        for(String s : input.split("\\s+")){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            anagrams.computeIfAbsent(key, k-> new ArrayList<>()).add(s);

        }
        for(List<String> result : anagrams.values()){
            System.out.println(result);
        }
    }
}
