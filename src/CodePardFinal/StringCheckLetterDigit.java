package CodePardFinal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringCheckLetterDigit {
    public static void main(String[] args){
        String str = "abc-2019";
        splitStringWithIdentifier(str);
    }

    private static void splitStringWithIdentifier(String str) {
        String[] words = str.split("-");
        List<String> letter = new ArrayList<>();
        List<String> digits = new ArrayList<>();
        letter.add(words[0]);
        digits.add(words[1]);
        System.out.println(letter);
        System.out.println(digits);
    }
}
