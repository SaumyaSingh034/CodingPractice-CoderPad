package July2026;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchFirstLast {
    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        findFirstAndLastElement(arr, target);
        findFirstAndLastElement(new int[]{5,7,7,8,8,10}, 6);
    }

    private static void findFirstAndLastElement(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        List<Integer> result = new ArrayList<>();
        while(left < right){
            if(target == arr[left] ){
                result.add(left);
                break;
            } else{
                left++;
            }
        }
        while(left < right){
            if(target == arr[right] ){
                result.add(right);
                break;
            } else{
                right--;
            }
        }
        if(result.isEmpty()){
            result.add(-1);
            result.add(-1);
        }
        System.out.println(result);

    }
}
