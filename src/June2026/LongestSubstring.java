package June2026;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args){
        String str = "baaabbabbb"; //7
        nab_LongestValidSubstring(str);
    }

    private static void nab_LongestValidSubstring(String str) {
        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> dataMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            dataMap.put(ch, dataMap.getOrDefault(ch, 0)+1);
            while(dataMap.get(ch) > 2){
                char leftChar = str.charAt(start);
                dataMap.put(leftChar, dataMap.get(leftChar)-1);
                start++;
            }
            if(i-start+1 > maxLength){
                maxLength = i-start+1;
            }
        }
        System.out.println(maxLength);

    }
}
