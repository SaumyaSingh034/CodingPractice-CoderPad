package July2026;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args){
        int[] arr = {100,4,200,1,3,2};
        int[] arr1 = {9,1,4,7,3,-1,0,5,8,-1,6};
        findLongestConsecutive(arr);
        findLongestConsecutive(arr1);
    }

    private static void findLongestConsecutive(int[] arr) {
        Arrays.sort(arr);
        for(int i = 1;i< arr.length;i++){
            if(arr[i-1] == arr[i]){
                continue;
            }

            else if (arr[i - 1] + 1 != arr[i]) {
                    System.out.println(arr[i - 1]);
                    break;
                }

        }
        System.out.println(Arrays.toString(arr));
    }
}
