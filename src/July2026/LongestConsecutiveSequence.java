package July2026;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args){
        int[] arr = {100,4,200,1,3,2};
        int[] arr1 = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(findLongestConsecutive(arr));
        System.out.println(findLongestConsecutive(arr1));

    }

    private static int findLongestConsecutive(int[] arr) {
        Arrays.sort(arr);
       int currentLength = 1;
       int maxLength = 1;
       for(int i=1;i< arr.length;i++){
           if(arr[i-1] == arr[i]){
               continue;
           }
           if(arr[i] == arr[i-1]+1){
               currentLength++;
           } else{
              maxLength =  Math.max(maxLength, currentLength);
               currentLength =1;
           }
       }
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;


    }
}
