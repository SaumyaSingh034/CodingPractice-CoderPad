package June2026;

import java.util.Arrays;

public class ShiftEveneLeftOddRight {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        shiftEvenLeftOddRight9(arr);
    }

    private static void shiftEvenLeftOddRight9(int[] arr) {
        int[] result = new int[arr.length];
        int left = 0;
        int right = arr.length-1;
        for(int i : arr){
            if(i%2==0){
                result[left++] = i;
            }else{
                result[right--]= i;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
