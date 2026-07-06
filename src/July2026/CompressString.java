package July2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class CompressString {
    public static void main(String[] args) {
        String str = "abcbad";
        System.out.println(compressString(str));
    }

    private static String compressString(String str) {
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException("Empty String or String is null");
        }
        StringBuilder result = new StringBuilder();
        for(Character c : str.toLowerCase().toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character,Integer> dataSet : dataMap.entrySet()) {
            result.append(dataSet.getKey()).append(dataSet.getValue());
        }
        return result.toString();

    }
}
