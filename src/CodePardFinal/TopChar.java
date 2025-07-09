package CodePardFinal;

import java.util.HashMap;
import java.util.Map;

public class TopChar {
    public static void main(String[] args){
        String input = "aaabbbccccddee";
        computeTop3Char(input);
    }

    private static void computeTop3Char(String input) {
        Map<Character, Integer> data = new HashMap<>();
        for(char c : input.toCharArray()){
            data.put(c, data.getOrDefault(c, 0)+1);
        }
        //System.out.println(data);
        data.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .limit(3).forEach(System.out::println);


        data.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .limit(3).forEach(System.out::println);
    }
}
