package MockInterview;

import java.util.Arrays;

public class SortArray {
    //Bubble Sort

    public static void main(String[] args){
        int[] arr = {5,1,4,2,8};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
