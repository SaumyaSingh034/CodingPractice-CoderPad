package July;

public class FindMissingNumber {
    public static void main(String[] args){
        int[] num = {0,2,3,6,8};
        findMissingNumbers(num);
    }

    private static void findMissingNumbers(int[] num) {
        for(int i=1;i< num.length;i++){
            int c = num[i];
            int p = num[i-1];
            for(int j=p+1;j<c;j++){
                System.out.print(j+" ");
            }
        }
    }
}
