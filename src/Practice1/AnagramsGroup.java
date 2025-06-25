package Practice1;

import java.util.*;

public class AnagramsGroup {
    public static void main(String[] args){
        String input = "cat dog tac sat tas god dog";
        groupAnagramFind(input);
    }

    private static void groupAnagramFind(String input) {
        Map<String, List<String>> dataMap = new LinkedHashMap<>();
        String[] words = input.split("\\s+");
        for(String word : words){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            dataMap.computeIfAbsent(str, s-> new ArrayList<>()).add(str);
        }
        StringBuilder result = new StringBuilder();

        for(List<String> data : dataMap.values()){
            result.append(data).append(" ");
        }

        System.out.println(result);
    }
}
