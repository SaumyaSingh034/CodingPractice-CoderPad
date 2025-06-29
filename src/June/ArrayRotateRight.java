package June;

import java.util.Arrays;

public class ArrayRotateRight {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int rotate = 2;
        rotateRight31(arr, rotate); // 1,2,3,4,5--> 5,1,2,3,4
        /*
        1,2,3,4,
        left rotate - 2
        2,3,4,5,1--> 3,4,5,1,2
        2,3,4,1 --> 3,4,1,2
        right rotate - 2
        5,1,2,3,4 --> 4,5,1,2,3

        4,1,2,3 --> 3,4,1,2
         */
    }

    private static void rotateRight31(int[] arr, int rotate) {
        for(int i=0;i<rotate;i++){
            int temp = arr[arr.length-1];
            for(int j = arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
