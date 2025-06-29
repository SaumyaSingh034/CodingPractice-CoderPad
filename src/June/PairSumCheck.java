package June;

import java.util.HashSet;
import java.util.Set;

public class PairSumCheck {
    public static void main(String[] args){
        int[] arr = {2, 4, 3, 5, 6, -1, 1};
        int target = 5;
        pairSumCheck00(arr, target);
    }

    private static void pairSumCheck00(int[] arr, int target) {
        Set<String> data = new HashSet<>();
        for(int i=0;i< arr.length;i++){
            for(int j=1;j<arr.length;j++){
                int sum = arr[i] + arr[j];
                if(sum == target){
                    int a = arr[i];
                    int b = arr[j];
                    String pair = "("+a+","+b+")";
                    data.add(pair);
                }
            }
        }
        System.out.println(data);
    }
}
