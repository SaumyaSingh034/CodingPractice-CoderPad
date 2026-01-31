package January_2026_CoderPad;

import java.util.Arrays;

public class RotateArray
{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int rotation = 1;

        rotateArrayLeft(arr, rotation);
    }

    private static void rotateArrayLeft(int[] arr, int rotation) {
        //2,3,4,5,1
        int temp = arr[arr.length-1];

        for(int i = arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
