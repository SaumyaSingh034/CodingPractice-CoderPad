package January_2026;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(checkAnagrams(str1, str2));
    }

    private static boolean checkAnagrams(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2))
            return true;
        else
            return false;
    }
}
