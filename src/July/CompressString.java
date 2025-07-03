package July;

import java.util.LinkedHashMap;
import java.util.Map;

public class CompressString
{
    public static void main(String[] args){
        String str = "aabbbcccc";
        compressString09(str);
    }

    private static void compressString09(String str) {
        Map<Character, Integer> data = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            data.put(c, data.getOrDefault(c, 0)+1);
        }
        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character, Integer> dataSet : data.entrySet()){
            result.append(dataSet.getKey()).append(dataSet.getValue());
        }

        System.out.println(result);

    }
}
