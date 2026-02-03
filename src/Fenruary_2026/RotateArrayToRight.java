package Fenruary_2026;

import java.util.Arrays;

public class RotateArrayToRight {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int k = 4;
        rotateArrayToRight(arr, k);
    }

    private static void rotateArrayToRight(int[] arr, int k) {
        for(int i=0;i<k;i++){
            /*
            1,2,3,4,5,6,7
            7,1,2,3,4,5,6
            6,7,1,2,3,4,5
            5,6,7,1,2,3,4
            4,5,6,7,1,2,3
             */
            int last = arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));
    }
}
