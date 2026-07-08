package July2026;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] arr = {"flower","flow","flight"};
        String[] arr1 = {"abcdef","abcxyz","abc123"};
        String[] arr2 = {"internet","interview","internal"};
        String[] arr3 = {"dog","racecar","car"};
//        longestCommonPrefix(arr);
//        longestCommonPrefix(arr1);
        correctCode(arr1);
        correctCode(arr2);
        correctCode(arr3);

    }

    private static void correctCode(String[] arr) {
        String prefix = arr[0]; //flower
        int end = prefix.length()-1;
      for(String word : arr) {
         while(!word.startsWith(prefix)){
             prefix = prefix.substring(0, end--);
         }
      }
      System.out.println(prefix);
    }

    private static void longestCommonPrefix(String[] arr) {
        int start = 0;
        StringBuilder result = new StringBuilder();
       for(int i=1;i<arr.length;i++){
           if(arr[i].charAt(start) == arr[i-1].charAt(start)){
               result.append(arr[i].charAt(start));
               start++;
           }
       }

       System.out.println(result);

    }

}