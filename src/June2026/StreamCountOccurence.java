package June2026;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCountOccurence {
    public static void main(String[] args){
        String str = "automation";
       Map<Character, Long> charCount =  str.chars().mapToObj(c -> (char) c )
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);
    }
}
