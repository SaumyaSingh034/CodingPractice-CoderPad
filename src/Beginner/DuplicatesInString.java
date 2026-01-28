package Beginner;

import July.SubArraySum;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesInString {
    public static void main(String[] args){
        String str = "duplicates removal for automation";
        removeDuplicatesFromString(str.toCharArray());
    }

    private static void removeDuplicatesFromString(char[] charArray) {
        Set<Character> uniqueChar = new LinkedHashSet<>();
        for(char c : charArray){
            uniqueChar.add(c);
        }
        System.out.println(uniqueChar);
    }
}
