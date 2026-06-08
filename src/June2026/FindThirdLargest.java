package June2026;

import java.util.Arrays;

public class FindThirdLargest {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};

        Arrays.sort(arr);
        System.out.println(arr[arr.length-3]);
    }
}
