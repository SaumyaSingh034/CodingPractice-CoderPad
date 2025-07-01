package July;

import java.util.HashSet;
import java.util.Set;

public class Panagram {
    public static void main(String[] args){
        String str = "The  brown fox jumps over the lazy dog";
        findMissingLetter111(str);

    }
    private static void findMissingLetter111(String str){
        final String alpha = "abcdefghijklmnopqrstuvwxyz";

        Set<Character> missing = new HashSet<>();
        for(char c : alpha.toCharArray()){
            missing.add(c);
        }

        for(char c : str.toCharArray()){
            missing.remove(c);
        }
        System.out.print(missing);

    }
}
