package October2026;

public class SecondLargest {

    public static void main(String[] args){
        int[] arr = {4,6,2,8,5,1,10,11,56,43};
        secondLargestElement(arr);
    }

    private static void secondLargestElement(int[] arr) {
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException();

        }
        int max = Integer.MIN_VALUE, sMax = Integer.MIN_VALUE;

        for(int i: arr){
            if(max < i){
                sMax = max;
                max = i;
            } else if (sMax < i && max!=i) {
                sMax = i;
            }
        }
        System.out.println(sMax);
    }
}
