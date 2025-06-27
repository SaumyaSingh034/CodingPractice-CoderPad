package InterviewPreparation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairSumCheck {
    public static void main(String[] args){
        int[] arr = {2, 4, 3, 5, 6, -1, 1};
        int target = 5;
        findPairSum(arr, target);
        System.out.println("*************************************");
       // findPairSum2(arr, target);
       //findPairSum1(arr, target);
    }

    private static void findPairSum1(int[] arr, int target) {
        Set<String> data = new HashSet<>();
       for(int i=0;i<arr.length;i++){
           for(int j=1;j<arr.length;j++){
               int sum = arr[i] + arr[j];
               if(target == sum){
                   int a = arr[i];
                   int b = arr[j];
                   String pair ="("+ a+" , "+b+")";
                  data.add(pair);
               }
           }
       }
       System.out.println(data);

    }

    private static void findPairSum(int[] arr, int target) {
        Set<Integer> data = new HashSet<>();
        Set<String> printed = new HashSet<>();
      for(int num : arr){
          int comp = target - num;
         // System.out.println(comp);
          if(data.contains(comp)){
              int a = Math.min(num, comp);
              int b = Math.max(num, comp);
              String pair = a+", "+b;
              if(!printed.contains(pair)){
                  System.out.println("("+pair+")");
                  printed.add(pair);
              }

          }
          data.add(num);

      }
    }
    private static void findPairSum2(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<String> printed = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            System.out.println(complement);
            if (seen.contains(complement)) {
                int a = Math.min(num, complement);
                int b = Math.max(num, complement);
                String key = a + "," + b;

                if (!printed.contains(key)) {
                    System.out.println("(" + a + ", " + b + ")");
                    printed.add(key);
                }
            }
            seen.add(num);
            System.out.println(seen);
        }
    }
}
