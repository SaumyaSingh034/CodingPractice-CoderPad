package January_2026_CoderPad;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestUniformString {
    public static void main(String[] args){
        String str = "abcabcbb";
        System.out.println(longestUnifromSubString(str));
    }

    private static String longestUnifromSubString(String str) {
        int maxStart = 0;
        int maxLength = 0;
        int start = 0;

        Set<Character> uniformSubString = new LinkedHashSet<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(uniformSubString.contains(ch)){
                uniformSubString.remove(str.charAt(start)); //0
                start++;
            }
            uniformSubString.add(ch);
            if(maxLength < i-start+1){
                maxLength = i-start+1;
                maxStart = start;
            }
        }
       System.out.println("Max Length = "+maxLength);
        return str.substring(maxStart, maxLength+maxStart);
    }
}
