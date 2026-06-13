package June2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsectionArray {
    public static void main(String[] args){
        Integer[] arr1 = {1,2,5,6,7};
        Integer[] arr2 = {12,5,6,3,4,17,4,4,1,8,9};

        intersectTheArray(arr1, arr2);
    }

    private static void intersectTheArray(Integer[] arr1, Integer[] arr2) {
        List<Integer> data1 = Arrays.asList(arr1);
        List<Integer> data2 = Arrays.asList(arr2);

        List<Integer> result = new ArrayList<>();
        for(int i: arr1){
            if(data1.contains(i) && data2.contains(i))
                result.add(i);
        }
        System.out.println(result);
    }
}
