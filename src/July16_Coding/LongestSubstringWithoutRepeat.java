package July16_Coding;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args){
        String str = "ssaauummyyYYaaaarahulsingh";
        checkLongestSubstringTest(str);
    }

    private static void checkLongestSubstringTest(String str) {
        Set<Character> charSet = new LinkedHashSet<>();
        int left = 0;
        int start=0;
        int maxLength = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            while(charSet.contains(c)){
                charSet.remove(str.charAt(left));
                left++;
            }
            charSet.add(c);
            if(i-left+1 > maxLength){
                maxLength = i-left+1;
                start = left;
            }
        }
        System.out.println(maxLength);
        System.out.println(str.substring(start, start+maxLength));
    }
}
