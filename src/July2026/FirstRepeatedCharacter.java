package July2026;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstRepeatedCharacter {
    public static void main(String[] args){
        String str = "abcbad";
        correctSolutionForThisApproach(str);
        if(correctSolutionForThisApproach(str) == null){
            System.out.println("No repeated character");
        } else{
            System.out.println(correctSolutionForThisApproach(str) );
        }
        if(findFirstRepeated(str) == null){
            System.out.println("No repeated character");
        } else{
            System.out.println(findFirstRepeated(str) );
        }
    }

    private static Character correctSolutionForThisApproach(String str) {
        Set<Character> data = new HashSet<>();
        for(char c : str.toCharArray()) {
            if (!data.contains(c)) {
                data.add(c);
            } else {
                return c;
            }


        }
        return null;
    }

    private static Character findFirstRepeated(String str) {
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException();
        }
        for(Character c : str.toLowerCase().toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }


        for(Map.Entry<Character,Integer> dataSet : dataMap.entrySet()){
            if(dataSet.getValue() > 1) {
                return dataSet.getKey();
            }

        }
        return null;
    }

}
