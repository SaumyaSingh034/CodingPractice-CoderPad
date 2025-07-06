package July;

public class SubArraySum {
    public static void main(String[] args){
        int[] arr = {1,4,20,3,10,5};
       System.out.println( hasSumArrayCheck(arr, 33));
    }

    private static boolean hasSumArrayCheck(int[] arr, int target) {
        int sum = 0;
        int start = 0;
        for(int i=0;i< arr.length;i++) {
            sum += arr[i];

            while (sum > target && start <= i){
                sum -= arr[start++];
            }
            if(sum == target){
                return true;
            }
        }
        return false;

    }
}
