package Practice1;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber1 {
    public static void main(String[] args){
        int[] arr = {1,3,4,6};
        printMissingNumber2(arr);

    }

    private static void printMissingNumber2(int[] arr) {
        List<Integer> data = new ArrayList<>();
        for(int i=0;i< arr.length-1;i++){
            int current = arr[i];
            int next = arr[i+1];
            for(int j = current+1;j<next;j++){
                data.add(j);
            }
        }
    }
}
