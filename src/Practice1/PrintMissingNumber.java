package Practice1;

import java.util.ArrayList;
import java.util.List;

public class PrintMissingNumber
{
    public static void main(String[] args){
        int[] arr = {1,2,4,6};
        findMissingNumber1(arr);
    }

    private static void findMissingNumber1(int[] arr) {
        List<Integer> missingNumber = new ArrayList<>();
        for(int i=0;i< arr.length-1;i++){
            int current = arr[i];
            int next = arr[i+1];
            for(int j=current+1;j<next;j++){
                missingNumber.add(j);
            }

        }
        System.out.println(missingNumber);
    }
}
