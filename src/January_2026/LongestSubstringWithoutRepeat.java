package January_2026;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args){
        String str = "abcabcbb";
        findLongestSubstringWithoutRepeat(str);

    }

    private static void findLongestSubstringWithoutRepeat(String str) {
        int left = 0;
        int start = 0;
        int maxLength = 0;
        Set<Character> unique = new LinkedHashSet<>();
        if(str == null || str.length() == 0){
            System.out.println("Empty String");
            return;
        }
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            while(unique.contains(c)){
                unique.remove(str.charAt(left));
                        left++;
            }
            unique.add(c);
            if(i-left+1 > maxLength){
                maxLength = i-left+1;
                start = left;
            }
        }
        System.out.println(str.substring(start, start+maxLength));

    }
}
