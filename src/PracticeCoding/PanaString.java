package PracticeCoding;

import java.util.SortedSet;
import java.util.TreeSet;

public class PanaString {
    public static void main(String[] args){
        String str = "The quick brown fox jumps over the lazy dog";
        String str1 = "saumya loves programming";
        panaString123(str);
        panaString123(str1);
    }
    private static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    private static void panaString123(String str) {
        SortedSet<Character> missing = new TreeSet<>();
        for(int i=0;i<alpha.length();i++){
            missing.add(alpha.charAt(i));
        }

        for(int i=0;i<str.length();i++){
            missing.remove(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for(char c : missing){
            result.append(c);
        }
        System.out.println(result);
    }
}
