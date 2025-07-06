package July;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr1 = {1,2,3,4,0};
        int maxSum = findMaxSubarraySum(arr1);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    private static int findMaxSubarraySum(int[] arr) {
        int max = arr[0];
        int currentMax = arr[0];
        for(int i=0;i<arr.length;i++){
            currentMax = Math.max(arr[i], currentMax+arr[i]);
            max = Math.max(max, currentMax);
        }
        return max;
    }

}
