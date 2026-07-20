package July2026;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class SquaresSortedArray {
    public static void main(String[] args){
        int[] arr = {-4,-1,0,3,10};
        int[] arr1 = {-7,-3,2,3,11};
        int[] arr2 = {-2,-1};
        SquareSortedArray(arr);
        SquareSortedArray(arr1);
        SquareSortedArray(arr2);

    }

    private static void SquareSortedArray(int[] arr) {
        List<Integer> sortedSquare = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int prod = 0;
             prod = arr[i] * arr[i];
             sortedSquare.add(prod);
        }
        Collections.sort(sortedSquare);
        System.out.println(sortedSquare);
    }
}
