package June2026;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {
    public static void main(String[] args){
        String str = "automation";
        removeDuplicates_001(str);
    }

    private static void removeDuplicates_001(String str) {
        Set<Character> unique = new LinkedHashSet<>();
        StringBuilder uniqueString = new StringBuilder();
        for(char c : str.toLowerCase().toCharArray()){
            if(!unique.contains(c)){
                unique.add(c);
                uniqueString.append(c);
            }
        }
        System.out.println(uniqueString.toString().trim());

    }
}
