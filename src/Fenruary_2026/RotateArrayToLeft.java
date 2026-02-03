package Fenruary_2026;

import java.util.Arrays;

public class RotateArrayToLeft {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int k = 4;
        rotateArrayToLeft(arr, k);
    }

    private static void rotateArrayToLeft(int[] arr, int k) {
        for(int i=0;i<k;i++){
            //2,3,4,5,6,7,1
            //3,4,5,6,7,1,2
            //4,5,6,7,1,2,3
            //5,6,7,1,2,3,4
            int first = arr[0]; //1
            for(int j = 0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = first;
        }
        System.out.println(Arrays.toString(arr));
    }
}
