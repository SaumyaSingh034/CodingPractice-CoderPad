package PracticeCoding;

public class SmallestNumber {
    public static void main(String[] args){
        int[] arr = {1,-9,8,-4,-2,-3};
        System.out.println(findSmallestNumber12345(arr));
    }

    private static int findSmallestNumber12345(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        if(arr == null || arr.length == 0)
            throw new IllegalArgumentException("The array has no data");
        if(arr.length == 1)
            return arr[0];
        else{

            for(int i : arr){
                if(smallest > i){
                    secSmallest = smallest;
                    smallest = i;
                } else if (secSmallest > i && i!=smallest) {
                    secSmallest = i;
                }
            }
        }
        return secSmallest;
    }
}
