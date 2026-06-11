package June2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountChars {
    public static void main(String[] args){
        String str = "aabbbccccddddd"; //a2b3c4d5
        countChars(str);
        compressString_test(str);
    }

    private static void compressString_test(String str) {
        Map<Character, Integer> dataSet = new LinkedHashMap<>();
        for(char c : str.toLowerCase().toCharArray()){
            dataSet.put(c, dataSet.getOrDefault(c, 0)+1);
        }
        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character, Integer> data : dataSet.entrySet()){
           result.append(data.getKey()).append(data.getValue());
        }
        System.out.println(result.toString().trim());
    }

    private static void countChars(String str) {
        Map<Character, Integer> dataSet = new LinkedHashMap<>();
        for(char c : str.toLowerCase().toCharArray()){
            dataSet.put(c, dataSet.getOrDefault(c, 0)+1);
        }


        for(Map.Entry<Character, Integer> data : dataSet.entrySet()){
             System.out.println(data.getKey()+" --> "+data.getValue());
        }
    }
}
