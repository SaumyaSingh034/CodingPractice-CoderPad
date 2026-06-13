package June2026;

import java.util.HashSet;
import java.util.Set;

public class EliminateDuplicateValue {
    public static void main(String[] args){
        String str = "Automation";
        eliminateDuplicateValue(str);
    }

    private static void eliminateDuplicateValue(String str) {
        Set<Character> unique = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for(char c: str.toLowerCase().toCharArray()){
            if(!unique.contains(c)){
                unique.add(c);
                result.append(c);
            }
        }
        System.out.println(result);

    }
}
