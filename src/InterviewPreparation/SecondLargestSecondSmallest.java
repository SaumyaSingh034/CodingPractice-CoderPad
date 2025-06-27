package InterviewPreparation;

import java.util.Arrays;

public class SecondLargestSecondSmallest {
    public static void main(String[] args){
        int[] arr = {1,8,7,-1,-9,11,54,31,98,77};
        findSecondLargestSecondSmallest(arr);
    }

    private static void findSecondLargestSecondSmallest(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Second Smallest " +arr[1]);
        System.out.println("Second Largest " +arr[arr.length-2]);
    }
}
