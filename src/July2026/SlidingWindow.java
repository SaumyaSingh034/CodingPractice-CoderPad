package July2026;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {

    public static void main(String[] args){
        String str = "abcabcbb";
        longestUniqueSubstring(str);
        longestUniqueSubstring("bbbbb");
        longestUniqueSubstring("pwwkew");
        longestUniqueSubstring("dvdf");
    }

    private static void longestUniqueSubstring(String str) {
        int maxLength = 0, maxStart = 0, end = 0, start = 0;
        Set<Character> unique = new HashSet<>();
        while(end < str.length()){
            char c = str.charAt(end);
            if(unique.contains(c)){
                unique.remove(str.charAt(start));
                start++;
            }else{
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
