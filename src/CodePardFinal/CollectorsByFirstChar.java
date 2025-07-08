package CodePardFinal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsByFirstChar {
    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry");
      Map<Character, List<String>> group =  words.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
      System.out.println(group);

    }
}
