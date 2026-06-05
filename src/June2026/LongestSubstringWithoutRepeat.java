package June2026;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args){
        String str = "abcabcbb";
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        for(int i = 0;i<str.length();i++){
            while(set.contains(str.charAt(i)))
                set.remove(str.charAt(left++));
            set.add(str.charAt(i));
            max = Math.max(max, i-left+1);
        }
        System.out.println(max);
    }
}
