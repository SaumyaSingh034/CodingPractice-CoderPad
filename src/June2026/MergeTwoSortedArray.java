package June2026;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArray {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        List<Integer> mergeData = new ArrayList<>();
        int i =0,j=0;

       while(i < arr1.length && j< arr2.length){
           if(arr1[i] <= arr2[j]){
               mergeData.add(arr1[i++]);
           } else{
               mergeData.add(arr2[j++]);
           }
       }

       while(i < arr1.length){
           mergeData.add(arr1[i++]);
       }

        while(j < arr2.length){
            mergeData.add(arr2[j++]);
        }
       System.out.println(mergeData);
    }
}
