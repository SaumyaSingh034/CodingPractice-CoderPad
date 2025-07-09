package CodePardFinal;

import java.util.Arrays;
import java.util.Comparator;

public class JustPrograms {
    public static void main(String[] args){
        int[] nums = {23, 45, 12, 98, 33};
        sortNumber(nums);
    }

    private static void sortNumber(int[] nums) {
       Arrays.stream(nums).boxed().sorted(Comparator.comparingInt(n -> n%10))
               .forEach(System.out::println);
    }
}
