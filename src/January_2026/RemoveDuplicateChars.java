package January_2026;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {
    public static void main(String[] args){
        String str = "programming";
        removeDuplicateCharacters(str);
    }

    private static void removeDuplicateCharacters(String str) {
        Set<Character> dataSet = new LinkedHashSet<>();
        StringBuffer result = new StringBuffer();
        for(char c : str.toCharArray()){
            if(dataSet.add(c)){
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
