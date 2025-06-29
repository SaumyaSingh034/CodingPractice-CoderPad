package June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InsertElementAtCertainPosition {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int p = 3;
        insertElement(arr, p);
        insertElement888(arr, p);
    }

    private static void insertElement888(int[] arr, int p) {
        List<Integer> data = Arrays.stream(arr).boxed().collect(Collectors.toList());
        data.add(p, 100);
        System.out.println(data);
    }


    private static void insertElement(int[] arr, int p) {
        int result[] = new int[arr.length+1];
        int j=0;
        while(j<result.length) {
            for (int i = 0; i < arr.length; i++) {
                if (i == p) {
                    result[j++] = 100;

                }
                result[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
