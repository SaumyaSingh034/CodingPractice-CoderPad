package MockerPadQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertElement {
    public static void main(String[] args){
        Integer[] arr = {1,2,3,4,5,6};
        int position = 2;
        insertValueUsingArray(arr, position);
        insertValueUsingArrayList(arr, position);
    }

    private static void insertValueUsingArrayList(Integer[] arr, int position) {
        List<Integer> data = new ArrayList<>(Arrays.asList(arr));
        data.add(position, 11);
        System.out.println(data);
    }

    private static void insertValueUsingArray(Integer[] arr, int position) {
        int[] result = new int[arr.length+1];
        int j=0;
        while(j< arr.length){
            for(int i=0;i< result.length;i++){
                if(i == position){
                    result[i] = 10;
                }else{
                    result[i] = arr[j++];
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
