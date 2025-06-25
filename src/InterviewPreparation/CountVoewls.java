package InterviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class CountVoewls {
    public static void main(String[] args){
        String str = "philadelphia is a place ";
        countVowelsOnly(str);
    }

    private static void countVowelsOnly(String str) {
        Map<Character, Integer> data = new HashMap<>();
        for(char c : str.toCharArray()){
            data.put(c, data.getOrDefault(c, 0)+1);
        }


        for(Map.Entry<Character, Integer> dataMap : data.entrySet()){
            if(dataMap.getKey() == 'a' || dataMap.getKey() == 'i' || dataMap.getKey() == 'e'
            || dataMap.getKey() == 'o' || dataMap.getKey() == 'u'){
                System.out.println(dataMap.getKey()+ "--> "+dataMap.getValue());
            }
        }
    }

}
