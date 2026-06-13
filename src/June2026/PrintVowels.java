package June2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintVowels {
    public static void main(String[] args){
        String str = "philadelphia is a place";
        printVowlesWithCount(str);
    }

    private static void printVowlesWithCount(String str) {
        str = str.replaceAll(" ","");
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        for(char c : str.toLowerCase().toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }


        for(Map.Entry<Character, Integer> dataSet : dataMap.entrySet()){
            if(dataSet.getKey() == 'a' || dataSet.getKey() == 'e' || dataSet.getKey() == 'i'
            || dataSet.getKey() == 'o' || dataSet.getKey() == 'u'){
                System.out.println(dataSet.getKey() +" --> "+dataSet.getValue());
            }
        }
    }
}
