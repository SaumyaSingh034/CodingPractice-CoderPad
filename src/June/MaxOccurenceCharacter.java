package June;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MaxOccurenceCharacter {
    public static void main(String[] args){
        List<Character> def = Arrays.asList('a','b','c','a','d','a','b');
        HashMap<Character, Integer> data = new HashMap<>();
        for(char i : def){
            data.put(i, data.getOrDefault(i, 0)+1);
        }

        int maxValue = Integer.MIN_VALUE;
        for(int i : data.values()){
            if(maxValue < i){
                maxValue = i;
            }
        }

        for(Map.Entry<Character, Integer> d : data.entrySet()){
            if(d.getValue() == maxValue){
                System.out.println(d.getKey());
            }
        }

    }
    }

