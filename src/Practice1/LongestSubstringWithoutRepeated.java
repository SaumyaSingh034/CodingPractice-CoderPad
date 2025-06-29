package Practice1;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeated {
    public static void main(String[] args){
        String str = "saumyasinnnggghhhhhhhhhhhhhh";
        nonrepeated(str);
    }

    private static void nonrepeated(String str) {
        int start = 0;
        int left = 0;
        int maxLength = 0;
        Set<Character> data = new HashSet<>();
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            while(data.contains(c)){
                data.remove(str.charAt(left));
                left++;
            }
            data.add(c);
            if(i-left+1 > maxLength){
                maxLength = i-left+1;
                start = left;

            }

        }
        System.out.println(str.substring(start, start+maxLength));
    }
}
