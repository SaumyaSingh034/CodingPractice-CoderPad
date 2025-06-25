package InterviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class LongestValidSubstring {
    public static void main(String[] args){
        String str = "baaabbabbb"; //7
        longestValidSubstring(str);
    }

    private static void longestValidSubstring(String str) {
        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> dataMap = new HashMap<>();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            dataMap.put(ch, dataMap.getOrDefault(ch, 0)+1);
            while(dataMap.get(ch) > 2){
                char leftChar = str.charAt(start);
                dataMap.put(leftChar, dataMap.get(leftChar)-1);
                start++;

            }
            if(i-start+1 > maxLength){
                maxLength = i-start;
            }
        }
        System.out.println(maxLength);
    }
}
