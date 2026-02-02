package Fenruary_2026;

import java.util.Arrays;

public class SortArrayByLastDigit {
    public static void main(String[] args){
        Integer[] arr1 = {23,11,45,32,9};
        sortArrayByLastIndex(arr1);
    }

    private static void sortArrayByLastIndex(Integer[] arr1) {
        if(arr1 == null || arr1.length == 0)
            throw new IllegalArgumentException();
        Arrays.sort(arr1, (a,b) -> (a % 10) - (b%10));
        System.out.println(Arrays.toString(arr1));
    }
}
