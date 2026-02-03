package Fenruary_2026;

import java.util.Arrays;

public class MoveZeroEnd {
    public static void main(String[] args){
        int[] arr = {1,0,3,0,5};
        int left = 0;
        int right = arr.length+1;
        for(int i : arr){
            if(i!=0)
                arr[left++] = i;

        }
        while(left < arr.length){
            arr[left++] = 0;
        }
        System.out.println(Arrays.toString(arr));

    }
}
