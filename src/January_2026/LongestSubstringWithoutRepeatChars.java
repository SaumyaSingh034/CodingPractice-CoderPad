package January_2026;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatChars {
    public static void main(String[] args) {
        String input = "abcabcbb";
        findLongestNonRepeatString(input);
    }

    private static void findLongestNonRepeatString(String input) {
        Set<Character> unique = new LinkedHashSet<>();
        int start = 0;
        int maxLength = 0;
        int maxStart = 0;
        if (input == null || input.length() == 0) {
            System.out.println("Empty String");
            return;
        }
        for (int end = 0; end < input.length(); end++) {
            char c = input.charAt(end);
            while (unique.contains(c)) {
                unique.remove(input.charAt(start));
                start++;
            }
            unique.add(c);
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }


        }

        System.out.println(input.substring(maxStart, maxStart + maxLength));
        System.out.println(maxLength);
    }
}
