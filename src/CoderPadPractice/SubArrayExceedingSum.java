package CoderPadPractice;

public class SubArrayExceedingSum {
    public static  void main(String[] args){
        int[] arr = {1,2,3,4};
        int target = 6;
        System.out.println(subArrayExceedingSum(arr, target));

    }

    private static int subArrayExceedingSum(int[] arr, int target) {
        int i=0;
        int sum = 0;
        int start=0;
        int min_length = Integer.MAX_VALUE;
        while( i < arr.length) {
            sum += arr[i++];

            if (sum > target) {
                min_length = Math.min(min_length, i - start);
                sum -= arr[start++];

            }
        }
        return (min_length == Integer.MAX_VALUE) ? 0 : min_length;
    }

}
