package July;

import java.util.Arrays;

public class RotateArrayToLeft {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int position = 4;
        //Op --> 2,3,4,5,1-->3,4,5,1,2--> 4,5,1,2,3
        rotateArrayToLeft_ByPosition(arr, position);
    }

    private static void rotateArrayToLeft_ByPosition(int[] arr, int position) {
        for(int i=0;i<position;i++){
            int temp = arr[0];
            for(int j=1;j< arr.length;j++){
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
