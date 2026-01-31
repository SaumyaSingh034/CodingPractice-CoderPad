package January_2026_CoderPad;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetCountOfLastWord {
    public static void main(String[] args){
        String str = "I am learning program";
        countCharofLastWord(str);
    }

    private static void countCharofLastWord(String str) {
        String[] words = str.split(" ");
        String lastWord = words[words.length-1];
        Map<Character, Integer> countCharacter = new LinkedHashMap<>();

        for(char c : lastWord.toCharArray()){
            countCharacter.put(c, countCharacter.getOrDefault(c, 0)+1);
        }

        for(Map.Entry dataSet : countCharacter.entrySet()){
            System.out.println(dataSet.getKey()+ " --> "+dataSet.getValue());
        }

    }
}
