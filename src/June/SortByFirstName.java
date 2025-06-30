package June;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class SortByFirstName {
    public static void main(String[] args){
        List<String> words = Arrays.asList("apple","banana", "apricot", "blueberry");
        Map<Character, List<String>> grouped = words.stream().
                collect(Collectors.groupingBy(word -> word.charAt(0)));

    }
}
