package July14_Coding;

import java.util.Arrays;

public class RotateArray_Right {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int rotate = 3;
        rotateArrayToTheRight(arr, rotate);
    }

    private static void rotateArrayToTheRight(int[] arr, int rotate) {
        for(int i=0;i<rotate;i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
