package July17_Coding;

public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = {10, 40, 20, 60, 50};
        secondLargestElementInArray(arr);

    }

    private static void secondLargestElementInArray(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > first){
                second = first;
                first = num;
            } else if (num > second) {
                second = num;

            }
        }
        System.out.println(second);
    }
}
