package InterviewPreparation;

import java.util.Arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        reverseArray123(arr);
    }

    private static void reverseArray123(int[] arr) {
        int left = 0, right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
