package Practice_2026.January;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestUniqueSubstring {
    public static void main(String[] args){
        String str = "abcabcbb";
        longestUniqueSubString(str);
    }

    private static void longestUniqueSubString(String str) {
        int start = 0;

        int maxLength = 0;
        int maxStart = 0;
        Set<Character> unique = new LinkedHashSet<>();
        for(int end = 0;end<str.length();end++){
            char c = str.charAt(end);
            if(unique.contains(c)){
                unique.remove(str.charAt(start));
                start++;
            }
            unique.add(c);
            if(maxLength < end-start+1){
                maxLength = end-start+1;
                maxStart = start;
            }
        }
        System.out.println(str.substring(maxStart, maxStart+maxLength));
    }
}
