package July;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubString {
    public static void main(String[] args){
        String str = "saumyasingh";
        findLongestUniqueSubstrings(str);
    }

    private static void findLongestUniqueSubstrings(String str) {
        char[] word = str.toLowerCase().toCharArray();
        Set<Character> uniqueChar = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        int start=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            while(uniqueChar.contains(c)){
                uniqueChar.remove(str.charAt(left));
                left++;
            }
            uniqueChar.add(c);
            if(i-left+1 > maxLength){
                maxLength = i-left+1;
                start = left;
            }
        }
        System.out.println(str.substring(start, start+maxLength));

    }
}
