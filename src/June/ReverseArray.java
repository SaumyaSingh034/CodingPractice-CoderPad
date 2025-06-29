package June;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        reverseArray99(arr); //1, 2 ,3,4,5
    }

    private static void reverseArray99(int[] arr) {
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
