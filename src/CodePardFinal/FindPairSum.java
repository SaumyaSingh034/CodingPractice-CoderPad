package CodePardFinal;

public class FindPairSum {
    public static void main(String[] args){
        int[] arr = {2, 4, 3, 5, 6, -1, 1};
        int target = 5;
        findPairSum12(arr, target);
    }

    private static void findPairSum12(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j< arr.length;j++){
                if(arr[i]+arr[j] == target){
                    int a = Math.min(arr[i], arr[j]);
                    int b = Math.max(arr[i], arr[j]);
                    System.out.println("("+a+", "+b+")");
                }
            }
        }
    }
}
