package CoderpadQuestions;

import java.util.*;

public class GroupAnagram {
    static String input = "cat dog tac sat tas god dog";

    static void setOfAnagrams(String inputString){

        //your code goes here
        String[] words = inputString.split("\\s+");
        StringBuilder sb = new StringBuilder();
        Map<String, List<String>> map = new LinkedHashMap<>();
        for(String w : words){
            char[] ch = w.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.computeIfAbsent(key, k ->  new ArrayList<>()).add(key);
        }
        for(List<String> groups : map.values()){
            for(String s : groups){
                sb.append(s).append(" ");
            }
        }
        System.out.println(sb.toString().trim());


    }


    public static void main(String[] args) {

        String input = "cat dog tac sat tas god dog";
        setOfAnagrams(input);

    }

}
