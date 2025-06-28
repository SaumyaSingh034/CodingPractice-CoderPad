package CoderPadPractice;

import java.util.Arrays;

public class SmallestSecond {
    public static void main(String[] args) {
        int[] arr = {3,6,8,2,4,0,7,5};
        findSmallestNumber(arr);

    }
    private static void findSmallestNumber(int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
