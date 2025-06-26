package MockerPadQuestions;

import java.util.Arrays;

public class ThirdLargestElement {
    public static void main(String[] args){
        int[] arr = {31,41,44,1,3,5,9,7,6,10,19,87};
        thirdLargestElement(arr);
    }

    private static void thirdLargestElement(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length-3]);
    }
}
