package July14_Coding;

import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int rotate = 3;
        //o/p --> 2,3,4,5,1 --> 3,4,5,1,2--> 4,5,1,2,3
        rotateArrayToTheLeftCheck(arr, rotate);
    }

    private static void rotateArrayToTheLeftCheck(int[] arr, int rotate) {
        for(int i=0;i< rotate;i++){
            int temp = arr[0];
            for(int j=1;j< arr.length;j++){
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}