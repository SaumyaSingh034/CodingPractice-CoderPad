package June2026;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddsAndEven {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Map<Boolean, List<Integer>> result = list.stream().collect(Collectors.partitioningBy(
                n -> n%2 ==0
        ));
        System.out.println(result);
    }
}
