package January_2026;

import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeatedWords {
    public static void main(String[] args){
        String str = "automation";
        findSecondMostRepeatedWords(str);
    }

    private static void findSecondMostRepeatedWords(String str) {
        Map<Character, Integer> dataMap = new HashMap<>();
        for(char c : str.toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }
        int max = 0;
        char maxChar = 0;
        char sMaxChar = 0;
        int sMax = 0;

        for(Map.Entry<Character, Integer> dataEntry : dataMap.entrySet()){
            if(max < dataEntry.getValue()){
                sMax = max;
                sMaxChar = maxChar;
                max = dataEntry.getValue();
                maxChar = dataEntry.getKey();
            } else if (dataEntry.getValue() < max && dataEntry.getValue() > sMax) {

                sMax = dataEntry.getValue();
                sMaxChar = dataEntry.getKey();
            }

        }
        System.out.println(sMaxChar+ "------> "+sMax);

    }
}
