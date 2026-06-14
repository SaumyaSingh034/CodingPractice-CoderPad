package June2026;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args){
        List<String> names =
                Arrays.asList(
                        "Amit",
                        "Ankit",
                        "Rahul",
                        "Ravi");

        Map<Character, List<String>> data = names.stream().collect(
                Collectors.groupingBy(
                        name -> name.charAt(0)
                )
        );
        System.out.println(data);
    }
}
