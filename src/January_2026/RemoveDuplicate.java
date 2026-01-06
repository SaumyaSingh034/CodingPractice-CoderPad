package January_2026;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,2,3,5);
        System.out.println(removeDuplicates(list));
    }

    private static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new LinkedHashSet<>();
        for(int i : list){
           seen.add(i);
        }
        return seen.stream().toList();
    }
}
