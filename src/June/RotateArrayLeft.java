package June;

import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        rotateArrayLeft12(arr, k); // 3,4,1,2
    }

    private static void rotateArrayLeft12(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            int temp = arr[0]; //4
            for (int j = 1; j < arr.length; j++) {
                arr[j-1] = arr[j ]; // arr[0] = arr[1] 1,2,3,4
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}