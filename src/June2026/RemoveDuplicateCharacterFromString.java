package June2026;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacterFromString {
    public static void main(String[] args){
        String str = "automation";
        removeDuplicateChar11(str);
    }

    private static void removeDuplicateChar11(String str) {
        Set<Character> unique = new LinkedHashSet<>();
        StringBuffer result = new StringBuffer();

        for(char c : str.toCharArray()){
            if(!unique.contains(c)) {
                unique.add(c);
                result.append(c);
            }
        }
        System.out.println(result);
        System.out.println(unique);
    }
}
