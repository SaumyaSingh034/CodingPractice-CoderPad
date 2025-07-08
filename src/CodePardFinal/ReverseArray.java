package CodePardFinal;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        reverseArrayFromLeft(arr);
    }

    private static void reverseArrayFromLeft(int[] arr) {
        int left =0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
