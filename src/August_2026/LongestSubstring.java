package August_2026;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args){
        String str = "abcabcbb";
        longestUniqueSubstring989(str);
    }

    private static void longestUniqueSubstring989(String str) {
        Set<Character> unique = new HashSet<>();
        int start = 0, end = 0, maxLength = 0, maxStart = 0;
        while(end < str.length()){
            char c = str.charAt(end);
            if(unique.contains(c)){
                unique.remove(str.charAt(start));
                start++;
            } else{
                unique.add(c);
                end++;
                if(end-start > maxLength){
                    maxLength = end-start;
                    maxStart = start;
                }
            }
        }
        System.out.println(str.substring(maxStart, maxStart + maxLength));
        System.out.println(maxLength);
    }
}
