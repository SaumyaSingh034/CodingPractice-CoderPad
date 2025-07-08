package CodePardFinal;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestUniformTest {
    public static void main(String[] args){
        String str = "tryakshrahulrahulrahul";
        String str1 = "ssaaUUUUUUUmmmYYYaaaaa";
        //checkLongestUniform(str);
        checkUniqueLongest(str1);
    }

    private static void checkUniqueLongest(String str) {
        int maxlength = 0;
        int maxStart = 0;
        int i=1;
        int length = str.length();

        while(i<length){
            int start = i-1;
            int currentLength = 1;
            while(i < length && str.charAt(i) == str.charAt(i-1)){
                i++;
                currentLength++;
            }
            if(currentLength > maxlength){
                maxlength = currentLength;
                maxStart = start;
            }
            i++;
        }
        System.out.println(str.substring(maxStart, maxStart+maxlength));
    }

    private static void checkLongestUniform(String str) {
      Set<Character> unique = new LinkedHashSet<>();
      int left = 0;
      int maxLength = 0;
      int start = 0;
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
        System.out.println(str.substring(start, start+maxLength));
    }
}
