package January_2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountWordOccurences {
    public static void main(String[] args){
        String words = "I am a QA and I love QA";
        countTheOccurenceOfWords(words);
    }

    private static void countTheOccurenceOfWords(String words) {
        String[] str = words.split("\\s+");
        Map<String, Integer> dataMap = new LinkedHashMap<>();
        for(String s : str){
            dataMap.put(s, dataMap.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String, Integer> data : dataMap.entrySet()){
            System.out.println(data.getKey()+" ---> "+data.getValue());
        }
    }
}
