package MockInterview;

public class FindMissing {
    public static void main(String[] args){
        int[] arr = {1,3,5,6,8,10};
        findMissingElementsInArray(arr);
    }

    private static void findMissingElementsInArray(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int prev = arr[i-1];
            for(int j=prev+1; j<current;j++)
                System.out.print(j+" ");
        }
    }
}
