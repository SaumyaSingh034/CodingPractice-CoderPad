package Beginner;

public class SmallestNumber {
    public static void main(String[] args){
        int[] arr = {8,9,10,11,12,14,15,3,77};
        findSmallest(arr);

    }

    private static void findSmallest(int[] arr) {
        int smallest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);

    }
}
