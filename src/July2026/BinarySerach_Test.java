package July2026;

public class BinarySerach_Test {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 5;
       System.out.println( binarySearch_test(nums, target));
    }

    private static int binarySearch_test(int[] nums, int target) {
      int left = 0;
      int right = nums.length-1;

      while(left < right){
          int mid = left + (right - left) / 2;
          if(nums[mid] == target){
             return mid;
          } else if(target < nums[mid]){
              right = mid-1;
          } else{
              left = mid +1;
          }
      }
      return left;
    }
}
