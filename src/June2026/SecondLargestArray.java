package June2026;

public class SecondLargestArray {
    public static void main(String[] args){
        int[] arr= {10,20,30,40,50};
        int largest = Integer.MIN_VALUE;
        int secondLargest =Integer.MIN_VALUE;

        for(int i: arr){
            if(i>largest){
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i!=largest) {
                secondLargest = i;

            }
        }
        System.out.println(secondLargest);
    }
}
