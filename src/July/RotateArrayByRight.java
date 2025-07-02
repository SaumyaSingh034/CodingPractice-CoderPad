package July;

import java.util.Arrays;

public class RotateArrayByRight {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int k = 3;
        //5,1,2,3,4
        rotateArrayByRight_ByPosition(arr, k);
    }

    private static void rotateArrayByRight_ByPosition(int[] arr, int k) {
        for(int i=0;i<k;i++){
            int temp = arr[arr.length-1];
            for(int j= arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
