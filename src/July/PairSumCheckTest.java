package July;

public class PairSumCheckTest {
    public static void main(String[] args){
        int[] arr = {2, 4, 3, 5, 6, -1, 1};
        int target = 5;
        sumCheckTest(arr, target);

    }

    private static void sumCheckTest(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(target == arr[i] + arr[j]){
                    int a = Math.min(arr[i], arr[j]);
                    int b = Math.max(arr[i], arr[j]);
                    String pair = "("+a+", "+b+")";
                    System.out.println(pair);
                }
            }
        }
    }
}
