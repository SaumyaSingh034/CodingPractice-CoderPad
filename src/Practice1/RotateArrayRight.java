package Practice1;

import java.util.Arrays;

public class RotateArrayRight {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int k = 1;
        rotateArray11(arr, k);
    }

    private static void rotateArray11(int[] arr, int k) {
        for(int i=0;i<k;i++){
            int temp = arr[0];
            for(int j=1;j< arr.length;j++){
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
