package Fenruary_2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestValidSubstring {
    public static void main(String[] args){
        String str = "baaabbabbb";
        findLongestValidSubstring(str);
    }

    private static void findLongestValidSubstring(String str) {
       int maxLen = 1;
       int currentLen = 1;
       char longestChar = str.charAt(0);
       int endIndex  = 0;

       for(int i=1;i<str.length();i++){
           if(str.charAt(i) == str.charAt(i-1))
               currentLen++;
           else
               currentLen=1;
           if(currentLen > maxLen){
               maxLen = currentLen;
               endIndex = i;
           }
       }
       System.out.println(maxLen);
       System.out.println(str.substring(endIndex-maxLen+1, endIndex+1));
    }
}
