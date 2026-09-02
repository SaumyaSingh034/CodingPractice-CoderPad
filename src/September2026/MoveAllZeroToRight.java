package September2026;

import java.util.Arrays;

public class MoveAllZeroToRight {
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 3, 12};
        moveAllZerotoRight(arr);
    }

    private static void moveAllZerotoRight(int[] arr) {
      int index = 0;
      for(int num : arr){
          if(num !=0){
              arr[index++] = num;
          }
      }
      while(index < arr.length){
          arr[index++] =0;
      }
      System.out.println(Arrays.toString(arr));
    }
}
