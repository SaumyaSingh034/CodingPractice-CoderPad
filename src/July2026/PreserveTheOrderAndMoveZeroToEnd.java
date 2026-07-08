package July2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreserveTheOrderAndMoveZeroToEnd {
    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {0,0,1};
        int[] arr3 = {4,0,5,0,3,0,2};
        int[] arr4 = {0,0,0};
        int[] arr5 = {5};
        int[] arr6 = {1,0};
        int[] arr7 = {0,1};
//        moveAllZeroAtEndPreserveOrder(arr);
//        moveAllZeroAtEndPreserveOrder(arr1);
//        moveAllZeroAtEndPreserveOrder(arr2);
//        moveAllZeroAtEndPreserveOrder(arr3);
//        moveAllZeroAtEndPreserveOrder(arr4);
//        moveAllZeroAtEndPreserveOrder(arr5);
//        moveAllZeroAtEndPreserveOrder(arr6);
//        moveAllZeroAtEndPreserveOrder(arr7);
        optimizedSolution(arr);
    }

    private static void optimizedSolution(int[] arr) {
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException(" Array is Null or Empty");
        }
        int left = 0;
        int right = arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[left++] = arr[i];
            }
        }
        while(left<right){
            arr[left++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void moveAllZeroAtEndPreserveOrder(int[] arr) {
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException(" Array is Null or Empty");
        }
       int[] result = new int[arr.length];
       int left = 0;
        for(int i : arr){
            if(i!=0){
               result[left++] = i;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
