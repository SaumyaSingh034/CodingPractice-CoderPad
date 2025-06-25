package CoderpadQuestions;

import java.util.HashMap;
import java.util.Map;

public class CycleCountLength {
    public static int countLengthOfCycle(int[] arr, int startIndex){
        Map<Integer, Integer> dataMap = new HashMap<>();
        int count = 1;
        int i = startIndex;
        while(!dataMap.containsKey(i)){
            if(arr[i] > arr.length)
                return -1;
            dataMap.put(i, count);
            count++;
            i = arr[i];
        }
        return count - dataMap.get(i);
    }
    public static void main( String[] args ) {

        boolean testsPassed = true;

        testsPassed &= countLengthOfCycle(new int[]{1, 0}, 0) == 2;
        testsPassed &= countLengthOfCycle(new int[]{1, 2, 0}, 0) == 3;

        if(testsPassed) {
            System.out.println( "Test passed." );
            //return true;
        } else {
            System.out.println( "Test failed." );
            //return false;
        }


    }
}

