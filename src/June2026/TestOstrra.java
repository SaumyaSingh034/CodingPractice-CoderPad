package June2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestOstrra {
    public static void main(String[] args){
        int[] arr1 = {2,4,7,3};
        int[] arr2 = {5,6,5,2};
        checkTheSum(arr1, arr2);
    }

    private static void checkTheSum(int[] arr1, int[] arr2) {
       int result[] = new int[arr1.length];
       int end = result.length-1;
        int data = 0;
       for(int i = arr1.length-1; i>=0;i--){
           int sum = arr1[i] +arr2[i] + data; //3+2
           if(sum < 10){
               result[end--] = sum;
           }else{
               int first = sum/10;
               int last = sum%10;
               result[end--] = last;
                data = first;
           }
       }
       System.out.println(Arrays.toString(result));
    }
}
