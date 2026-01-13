package January_2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateWordInString {
    public static void main(String[] args){
        String str = "Big black bug bit a big black dog on his big black nose";
        duplicateWord(str);
    }

    private static void duplicateWord(String str) {
        Map<String, Integer> dataMap = new LinkedHashMap<>();
        for(String s : str.split("\\s+")){
            dataMap.put(s, dataMap.getOrDefault(s, 0)+1);
        }

        for(Map.Entry<String, Integer> dataKey : dataMap.entrySet()){
            if(dataKey.getValue() > 1){
                System.out.println(dataKey.getKey()+" ---> "+dataKey.getValue());
            }
        }
    }
}
