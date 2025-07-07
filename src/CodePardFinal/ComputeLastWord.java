package CodePardFinal;

import java.util.LinkedHashMap;
import java.util.Map;

public class ComputeLastWord {
    public static void main(String[] args){
        String input = "I am learning program";
        computeLastWord(input);
    }

    private static void computeLastWord(String input) {
        if(input == null || input.isEmpty())
            throw new IllegalArgumentException("The String is either null or empty");
        String[] words = input.split("\\s+");
        String lastWord = words[words.length-1];
        Map<Character, Integer> compute = new LinkedHashMap<>();
        for(char c : lastWord.toCharArray())
            compute.put(c, compute.getOrDefault(c, 0)+1);
        for(Map.Entry<Character, Integer> dataSet : compute.entrySet())
            System.out.println(dataSet.getKey()+" ----> "+dataSet.getValue());
    }
}
