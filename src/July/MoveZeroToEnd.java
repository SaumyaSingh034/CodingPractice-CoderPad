package July;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args){
        int[] arr = {0,1,0,2,0,3,0,4,5,0,0,7,8,9,10,0,0,0,55,67,34,78,0,0};
        moveZeroToEnd(arr);
    }

    private static void moveZeroToEnd(int[] arr) {
        int[] result = new int[arr.length];
        int left = 0;
        int right = arr.length-1;
       for(int i =0;i< arr.length;i++){
           if(arr[i] != 0)
               result[left++] = arr[i];
           else
               result[right--] = 0;

       }
       System.out.println(Arrays.toString(result));
    }
}
