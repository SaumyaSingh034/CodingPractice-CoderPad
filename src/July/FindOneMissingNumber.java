package July;

public class FindOneMissingNumber {
    public static void main(String[] args){
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(findOneMissingNumber(arr));
    }

    private static int findOneMissingNumber(int[] arr) {
        int n = arr.length;;
        int expectedSum = n * (n+1)/2;
        int actualSum = 0;
        for(int i : arr)
            actualSum += i;
        return expectedSum-actualSum;
    }
}
