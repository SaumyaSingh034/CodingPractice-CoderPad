package CoderPadPractice;

import java.util.HashSet;
import java.util.Set;

public class Panagram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        String str1 = "The quick brown fox jumps over the lazy";
        findPanagram(str1);

    }
    private static void findPanagram(String str){
        String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        Set<Character> missing = new HashSet<>();
        for(int i =0;i<ALPHABET.length();i++){
            missing.add(ALPHABET.charAt(i));
        }

        for(int i=0;i<str.length();i++){
            missing.remove(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for(char c : missing){
            sb.append(c);
        }
        System.out.println(sb);
    }

}
