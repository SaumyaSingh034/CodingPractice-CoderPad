package June2026;

import java.util.HashMap;
import java.util.Map;

public class FindLengthOfEachString {
    public static void main(String[] args){
        String str = "Saumya Singh Automation Tester in Java Python Selenium RestAssured";
        findLengthOfEachWord(str);
    }

    private static void findLengthOfEachWord(String str) {
        String[] words = str.split("\\s+");
        int max = Integer.MIN_VALUE;
        Map<String, Integer> data = new HashMap<>();
        for (String word : words) {
            System.out.println(word + " --> " + word.length());
            int length = word.length();
            data.put(word, length);
            if (length > max) {
                max = length;
            }
        }

        for(Map.Entry<String, Integer> dataMap : data.entrySet()){
            if(dataMap.getValue() == max){
                System.out.println("Largest Word is : "+dataMap.getKey());
            }
        }


    }
}
