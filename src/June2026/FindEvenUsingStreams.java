package June2026;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindEvenUsingStreams {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,4,3,4,1);
        nums.stream().filter(n -> n%2==0).forEach(System.out::println);

        //Duplicates in List
        Set<Integer> set = new HashSet<>();
        nums.stream().filter(n -> !set.add(n)).forEach(System.out::print);

        //Highest Number
        int max = nums.stream().max(Integer::compare).get();
        System.out.println("Highest Number : "+max);
    }
}
