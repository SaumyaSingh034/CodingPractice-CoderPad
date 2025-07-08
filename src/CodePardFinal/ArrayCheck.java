package CodePardFinal;

import java.util.Arrays;

public class ArrayCheck {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5}; //5,1,2,3,4
        for(int i=0;i<2;i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
