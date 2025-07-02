package July;

import java.util.Arrays;

public class LongestUniformSubstringFromString {
    public static void main(String[] args){
        String str = "abcbbccaaabbbcccccabcaabbbabaa";
        System.out.println(Arrays.toString(findUniformSubSTringFromString(str)));
    }

    private static int[] findUniformSubSTringFromString(String str) {
        if(str == null || str.isEmpty())
            throw new IllegalArgumentException("String is either empty or Null");
        int maxStart = 0;
        int maxLength = 0;
        int i=1;
        int length = str.length();
        str = str.toLowerCase();
        while(i < length){
            int start = i-1;
            int currentLength = 1;
            while(i< length && str.charAt(i) == str.charAt(i-1)){
                i++;
                currentLength++;
            }
            if(currentLength > maxLength){
                maxStart = start;
                maxLength = currentLength;
            }
            i++;
        }
        System.out.println(str.substring(maxStart, maxStart+maxLength));
        return new int[] {maxStart, maxLength};
    }
}
