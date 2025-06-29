package June;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayByLastDigit {
    public static void main(String[] args){
        Integer[] arr = {15,18,11,19,12,14};
        Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return (a%10) - (b%10);
            }
        });
        System.out.println(Arrays.toString(arr));

    }

    private static void sortByLastDigit6678(int[] arr) {


    }
}
