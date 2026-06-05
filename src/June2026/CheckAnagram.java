package June2026;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";

        if(checkAnagram(s1, s2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }

    private static boolean checkAnagram(String s1, String s2) {
        if(s1.length()!= s2.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}
