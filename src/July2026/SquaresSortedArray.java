package July2026;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SquaresSortedArray {
    public static void main(String[] args){
        int[] arr = {-4,-1,0,3,10};
        int[] arr1 = {-7,-3,2,3,11};
        int[] arr2 = {-2,-1};
//        SquareSortedArray(arr);
//        SquareSortedArray(arr1);
//        SquareSortedArray(arr2);
        squareSortedInOptimizedWay(arr);

    }

    private static void squareSortedInOptimizedWay(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int index = arr.length-1;
        int[] result = new int[arr.length];
        while(start<= end){
            int prodcutS = arr[start] * arr[start]; //16
            int productE = arr[end] * arr[end];//100
            if(productE > prodcutS){
                result[index--] = productE;
                end--;
            }else{
                result[index--] = prodcutS;
                start++;
            }
        }
        System.out.println(Arrays.toString(result));
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
