package InterviewPreparation;

import java.util.Arrays;

public class RotateArrayRight {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        rotateArray(arr, 1); //6,1,2,3,4,5
    }

    private static void rotateArray(int[] arr, int k) {
        for(int i=0;i<k;i++){
            int temp = arr[arr.length-1];
            for(int j= arr.length-1; j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
