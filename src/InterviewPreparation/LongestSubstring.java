package InterviewPreparation;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args){
        String str = "ssaaUUmmmYYYaaaaa";
        longestUniqueSubstring123(str);
    }

    private static void longestUniqueSubstring123(String str) {
        int maxLength = 0;
        int left = 0;
        int start = 0;
        Set<Character> unique = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            while(unique.contains(c)){
                unique.remove(str.charAt(left));
                left++;

            }

            unique.add(c);
            if(i-left+1 > maxLength){
                maxLength = i-left+1;
                start=left;
            }
        }

        System.out.println(str.substring(start, start+maxLength));
    }
}
