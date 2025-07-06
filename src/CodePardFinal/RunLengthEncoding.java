package CodePardFinal;

import java.util.LinkedHashMap;
import java.util.Map;

public class RunLengthEncoding {
    public static void main(String[] args){
        String str = "abbcccddddefffghijklllmnoppp";
        String str1 = "abbbcccd";
        calculateRunLengthEncoding(str1);
    }

    private static void calculateRunLengthEncoding(String str) {
        Map<Character, Integer> calculateLength = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();
        if(str == null || str.isEmpty())
            throw new IllegalArgumentException("String is either null or empty");
        for(char c : str.toCharArray())
            calculateLength.put(c, calculateLength.getOrDefault(c, 0)+1);
        for(Map.Entry<Character, Integer> dataSet : calculateLength.entrySet()){
            result.append(dataSet.getKey()).append(dataSet.getValue());
        }
        System.out.println(result);
    }
}
