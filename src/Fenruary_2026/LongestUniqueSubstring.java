package Fenruary_2026;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestUniqueSubstring {
    public static void main(String[] args){
        String str = "saumyasingh";
        findUniqueLongestSubstring(str);
        findUniqueLongestSubstring1(str);
    }

    private static void findUniqueLongestSubstring(String str) {
        int maxLength = 0;
        int start = 0;
        int maxStart = 0;
        Set<Character> unique = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            while(unique.contains(c)){
                unique.remove(str.charAt(start));
                start++;
            }
                unique.add(c);
                if (maxLength < i - start +1  ) {
                    maxLength = i - start +1 ;
                    maxStart = start;

            }
        }
        System.out.println(str.substring(maxStart, maxStart+maxLength));
    }

    private static void findUniqueLongestSubstring1(String str) {
        int maxLength = 0, start = 0, end = 0, maxStart = 0;
        Set<Character> set = new HashSet<>();

        while(end < str.length()){
            char ch = str.charAt(end);
            if(!set.contains(ch)){
                set.add(ch);
                end++;
                if(end-start > maxLength){
                    maxLength = end-start;
                    maxStart = start;
                }

            }else{
                set.remove(str.charAt(start));
                start++;

            }
        }
        System.out.println(str.substring(maxStart, maxStart+maxLength));
    }
}
