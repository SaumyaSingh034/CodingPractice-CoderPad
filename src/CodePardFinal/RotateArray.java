package CodePardFinal;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] arr = {11,12,13,14,15};
        int rotation = 2;
        //rotateWithPositionToLeft(arr, rotation);
        rotateWithPositionToRight(arr, rotation);
        //12,13,14,15,11--> 13,14,15,11,12
    }

    private static void rotateWithPositionToRight(int[] arr, int rotation) {
        //11,12,13,14,15 --> 15,11,12,13,14 --> 14,15,11,12,13;
        for(int i=0;i<rotation;i++){
            int temp = arr[arr.length-1]; //last
            for(int j=arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateWithPositionToLeft(int[] arr, int rotation) {
        for(int i=0;i<rotation;i++){
            int temp = arr[0];
            for(int j=1;j< arr.length;j++){
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
