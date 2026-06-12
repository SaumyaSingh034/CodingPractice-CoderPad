package June2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurenceOfWords {
    public static void main(String[] args){
        String str = "java selenium java api java";
        countWords(str);
    }

    private static void countWords(String str) {
        Map<String, Integer> dataMap = new LinkedHashMap<>();
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException();
        }
        for(String word : str.split("\\s+")){
            dataMap.put(word, dataMap.getOrDefault(word,0)+1);
        }


        for(Map.Entry<String, Integer> data : dataMap.entrySet()){
            System.out.println(data.getKey() +" ---> "+data.getValue());
        }
    }
}
