package CodePardFinal;

import java.util.ArrayList;
import java.util.Arrays;

public class SortIntArrayByLastDigit {
    public static void main(String[] args){
        int[] num = {34,23,56,87,90,91,31,42,53,74};
        System.out.println(Arrays.toString(sortTheArrayByLastDigit(num)));
    }

    private static Integer[] sortTheArrayByLastDigit(int[] num) {
        Integer[] boxed = Arrays.stream(num).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, (a, b) -> Integer.compare(a%10,b%10));
        return boxed;
    }
}
