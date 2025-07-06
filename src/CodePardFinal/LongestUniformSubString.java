package CodePardFinal;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestUniformSubString {
    public static void main(String[] args){
        String input = "abcabcabcdddderffdddhujklnooo";
        int[] result = longestUniformSubstringCheck(input);
        int[] result1 = longestNonRepeatedStringCheck(input);
        System.out.println("Max Length : "+result[1]);
        System.out.println("Substring : "+input.substring(result[0], result[0]+result[1]));
        System.out.println("********************************************");
        System.out.println("Max Length : "+result1[1]);
        System.out.println("Substring : "+input.substring(result1[0], result1[0]+result1[1]));

    }

    private static int[] longestNonRepeatedStringCheck(String input) {
        Set<Character> uniqueSet = new LinkedHashSet<>();
        int left = 0;
        int start = 0;
        int maxLength = 0;
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            while(uniqueSet.contains(c)){
                uniqueSet.remove(input.charAt(left));
                left++;
            }
            uniqueSet.add(c);
            if(i-left+1 > maxLength){
                start = left;
                maxLength = i-left+1;
            }
        }
        return new int[]{start, maxLength};
    }

    private static int[] longestUniformSubstringCheck(String input) {
        int maxStart = 0;
        int maxLength = 0;
        int i=1;
        int length = input.length();

        while(i < length){
            int start = i-1;
            int currentLen = 1;
            while(i < length && input.charAt(i) == input.charAt(i-1)){
                i++;
                currentLen++;
            }
            if(currentLen > maxLength){
                maxStart = start;
                maxLength = currentLen;
            }
            i++;
        }
        return new int[]{maxStart, maxLength};
    }
}
