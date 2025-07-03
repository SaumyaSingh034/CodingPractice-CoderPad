package July;

import java.util.HashSet;
import java.util.Set;

public class LongStringWithoutRepeat {
    public static void main(String[] args){
        String str = "saumyacodesaumya";
        findLongestSubsNonRepeat(str);
    }

    private static void findLongestSubsNonRepeat(String str) {
        Set<Character> unique = new HashSet<>();
        int left=0;
        int start=0;
        int maxLength=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            while(unique.contains(c)){
                unique.remove(str.charAt(left));
                left++;
            }
            unique.add(c);
            if(i-left+1 > maxLength){
                start = left;
                maxLength = i-left+1;
            }
        }
        System.out.println("Start : "+start);
        System.out.println("MaxLength : "+maxLength);
        System.out.println("Substring : "+str.substring(start, start+maxLength));
    }
}
