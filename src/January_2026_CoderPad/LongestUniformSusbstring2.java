package January_2026_CoderPad;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestUniformSusbstring2 {
    public static void main(String[] args) {
        String input1 = "saumya"; //saumy
        longestUniformSubstring2(input1);
    }

    private static void longestUniformSubstring2(String input1) {
        int left = 0;
        int maxLength = 0;
        int maxStart = 0;
        Set<Character> unique = new LinkedHashSet<>();
        for (int i = 0; i < input1.length(); i++) {
            char alpha = input1.charAt(i); //s
            if (unique.contains(alpha)) {
                unique.remove(input1.charAt(left));
                left++;
            }
            unique.add(alpha);
            if (maxLength < i - left + 1) {
                maxLength = i - left + 1;
                maxStart = left;
            }
        }
        System.out.println(maxLength);
        System.out.println(input1.substring(maxStart, maxLength+maxStart));
    }
}
