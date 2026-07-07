package July2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class CompressString {
    public static void main(String[] args) {
        String str = "aabcccaaa";
        //System.out.println(compressString(str));
        System.out.println(correctCodeCompressString(str));
    }

    private static String correctCodeCompressString(String str) {
        StringBuilder result = new StringBuilder();
        char current = str.charAt(0); //a
        int count = 1;
        for(int i=1;i<str.length();i++){
            if(current == str.charAt(i)){
                count++;
            }else{
                result.append(current).append(count); //a1
                current = str.charAt(i);
                count=1;
            }
        }
        result.append(current).append(count);
        return result.toString();
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
