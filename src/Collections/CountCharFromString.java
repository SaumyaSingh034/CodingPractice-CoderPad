package Collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CountCharFromString {
    public static void main(String[] args){
        List<String> data = new ArrayList<>();
        data.add("java");
        data.add("python");
        data.add("selenium");
        data.add("typescript");
        data.add("restassured");
        data.add("appium");
        changeListToMapChar1(data);
    }

    private static void changeListToMapChar1(List<String> data) {

        List<String> result;
        for(String word : data){
            Map<Character, Integer> dataMap = new LinkedHashMap<>();
            for(char c : word.toCharArray()){
                dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
            }
            System.out.println(word+" ---> "+dataMap);
        }
    }
}
