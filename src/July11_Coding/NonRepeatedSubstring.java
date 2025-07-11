package July11_Coding;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatedSubstring {
    public static void main(String[] args){
        String str = "saumyasingh";
        nonRepeatedSubstringCheck(str);
    }

    private static void nonRepeatedSubstringCheck(String str) {
        Set<Character> unique = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        int start = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            while(unique.contains(c)){
                unique.remove(str.charAt(left++));
            }
            unique.add(c);
            if(i-left+1 > maxLength){
                start = left;
                maxLength = i-left+1;

            }
        }
        System.out.println("Maxlength : "+maxLength);
        System.out.println("MaxStart : "+start);
        System.out.println("Substring : "+str.substring(start, start+maxLength));
    }
}
