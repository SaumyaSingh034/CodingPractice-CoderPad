package CodePardFinal;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args){
        int[] num = {34,23,56,87,90,91,31,42,53,74};
       System.out.println( sortArray(num));
    }

    private static Integer[] sortArray(int[] num) {
        Integer[] boxed = Arrays.stream(num).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, (a, b) -> Integer.compare(a%10, b%10));
        return boxed;
    }
}
