package October2026;

import java.util.Arrays;

public class MoveZeroToLeft {
    public static void main(String[] args){

        int[] arr = {1,0,2,0,3,0,4,0,5,0,6};
        moveAllElementsToLeft(arr);
    }

    private static void moveAllElementsToLeft(int[] arr) {
        int left = 0;
        int right = arr.length;
        for(int i : arr){
            if(i != 0 ){
                arr[left++] = i;
            }
        }
        while(left < right){
            arr[left++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
