package CodePardFinal;

import java.util.HashSet;
import java.util.Set;

public class PanagramCheck {
    public static void main(String[] args){
        String str = "The quick brown fox jumps over the lazy dog";
        checkPanagram(str);

    }

    private static void checkPanagram(String str) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Set<Character> unique = new HashSet<>();
        for(char c : alpha.toCharArray()){
            unique.add(c);
        }
        for(char c : str.toCharArray()){
            unique.remove(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : unique){
            sb.append(c);
        }

        System.out.println(sb);
    }
}
