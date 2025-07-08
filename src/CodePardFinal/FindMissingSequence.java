package CodePardFinal;

public class FindMissingSequence {
    public static void main(String[] args){
        int[] arr = {1,2,4,5,7};
        checkTheMissingNumber(arr);
    }

    private static void checkTheMissingNumber(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int current = arr[i]; //2
            int prev = arr[i-1]; //1
            for(int j = prev+1; j<current;j++)
                System.out.println(j+" ");
        }
    }
}
