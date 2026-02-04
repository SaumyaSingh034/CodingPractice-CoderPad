package Fenruary_2026;

import java.util.Arrays;

public class RotateArr {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5}; //5,1,2,3,4 //4,5,1,2,3 //3,4,5,1,2
        int rotation = 2;

        //Rotate left

        for(int i=0;i<rotation;i++){
            int first = arr[0];
            for(int j=0;j<arr.length-1;j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = first;
        }
        System.out.println(Arrays.toString(arr));





        //Rotate right
        for(int i=0;i<rotation;i++){
            int last = arr[arr.length-1];
            for(int j = arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));
    }
}
