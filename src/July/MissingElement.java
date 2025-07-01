package July;

public class MissingElement {
    public static void main(String[] args){
        int[] arr = {1,3,5,7,9,11};
        findMissingElement981(arr);
    }

    private static void findMissingElement981(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int c = arr[i]; //3
            int p = arr[i-1]; //1
            for(int j= p+1;j<c;j++){
                System.out.print(j+" ");
            }
        }
    }
}
