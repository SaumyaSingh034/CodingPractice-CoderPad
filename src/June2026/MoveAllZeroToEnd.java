package June2026;

import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args){
        int arr[] = {1,0,3,0,5,0,7};
        moveAllZeroToEnd(arr);
    }

    private static void moveAllZeroToEnd(int[] arr) {
        int result[] = new int[arr.length];
        int left = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] !=0)
                result[left++] = arr[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
