package June;

import java.util.LinkedHashSet;
import java.util.Set;

public class PanagramTest {
    public static void main(String[] args){
        String str = "The quick brown fox jumps over the lazy dog";
        checkp(str);
    }

    private static void checkp(String str) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Set<Character> missing = new LinkedHashSet<>();
        for(char c : alpha.toCharArray()){
            missing.add(c);
        }
        for(char c : str.toCharArray()){
            missing.remove(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : missing){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
