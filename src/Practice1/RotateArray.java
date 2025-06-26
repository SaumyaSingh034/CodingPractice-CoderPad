package Practice1;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int rotation = 2;
        rotateArray123(arr, rotation);
    }

    private static void rotateArray123(int[] arr, int rotation) {
       for(int i=1;i<=rotation;i++){
           int temp = arr[0];
           for(int j=1;j< arr.length;j++){
               arr[j-1] = arr[j];

           }
           arr[arr.length-1] = temp;
       }
       System.out.println(Arrays.toString(arr));
    }
}
