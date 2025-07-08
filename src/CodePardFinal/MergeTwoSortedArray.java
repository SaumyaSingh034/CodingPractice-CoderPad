package CodePardFinal;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoSortedArray {
    public static void main(String[] args){
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] result = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(result));
    }
}
