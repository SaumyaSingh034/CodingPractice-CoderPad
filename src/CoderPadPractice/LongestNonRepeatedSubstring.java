package CoderPadPractice;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatedSubstring {
    public static void main(String[] args) {
        String str = "ssaaUUmmmYYYaaaaa";
        findLongestNonRepeated(str);

    }
    private static void findLongestNonRepeated(String str){
        int start = 0;
        int left = 0;
        int maxLength = 0;
        Set<Character> data = new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            while(data.contains(ch)){
                data.remove(str.charAt(left));
                left++;

            }
            data.add(ch);
            if(i-left+1 > maxLength){
                maxLength = i-left+1;
                start = left;
            }
        }
        System.out.println(str.substring(start, start+maxLength));
    }
}
