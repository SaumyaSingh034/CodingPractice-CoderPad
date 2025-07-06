package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

public class ListToMap {
    public static void main(String[] args){
        List<String> data = new ArrayList<>();
        data.add("java");
        data.add("python");
        data.add("selenium");
        data.add("typescript");
        data.add("restassured");
        data.add("appium");
        changeListToMapChar(data);
    }

    private static void changeListToMapChar(List<String> data){
        Map<Character, Integer> countChar = new LinkedHashMap<>();

        for(String word : data){
            if(word != null && !word.isEmpty()){
                char firstChar = Character.toUpperCase(word.charAt(0));
                countChar.put(firstChar, countChar.getOrDefault(firstChar, 0)+1);
            }
        }

        for(Map.Entry<Character, Integer> dataENtry : countChar.entrySet()){
            System.out.println(dataENtry.getKey()+ "--> "+dataENtry.getValue());
        }


    }

}
