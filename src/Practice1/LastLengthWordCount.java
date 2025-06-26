package Practice1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LastLengthWordCount {
    public static void main(String[] args){
        String str = "“I am learning program";
        lastWordCount(str);
    }

    private static void lastWordCount(String str) {
        
        String[] words = str.split("\\s+");
        String lastWord = words[words.length-1];
        System.out.println(lastWord.length());
        Map<Character, Integer> data = new LinkedHashMap<>();

        for(char c : lastWord.toCharArray()){
            data.put(c, data.getOrDefault(c, 0)+1);
        }
        System.out.println(data);
    }
}
