package June2026;

import java.util.HashSet;
import java.util.Set;

public class JavaLongestSubstring {
    public static void main(String[] args){
        String str = "saumyasingh";
        String str1 = "abcabcbb";
        System.out.println(findLongestUniqueSubstring(str));
        System.out.println(findLongestUniqueSubstring(str1));
    }

    private static int findLongestUniqueSubstring(String str) {
        if(str == null || str.isEmpty()){
            return 0;
        }
        Set<Character> unique = new HashSet<>();
        int maxLength = 0, maxStart = 0, start = 0, end = 0;

        while(end < str.length()){
            char ch = str.charAt(end);
            if(!unique.contains(ch)){
                unique.add(ch);
                end++;
                if(end-start > maxLength){
                    maxLength = end-start;
                    maxStart = start;
                }
            } else{
                unique.remove(str.charAt(start));
                start++;
            }
        }
        System.out.println(str.substring(maxStart, maxStart+maxLength));
        return maxLength;
    }
}
