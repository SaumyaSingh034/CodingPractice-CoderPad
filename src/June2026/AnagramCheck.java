package June2026;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args){
        String str1 = "silent";
        String str2 = "listen";
        System.out.println(anagramCheck(str1, str2));

    }

    private static Boolean anagramCheck(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
}
