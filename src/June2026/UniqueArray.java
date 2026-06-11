package June2026;

import java.util.*;

public class UniqueArray {
    public static void main(String[] args){
        int[] arr={1,2,3,2,4,5,1};
        secondLargest_001(arr);
        Set<Integer> unique = new LinkedHashSet<>();
        List<Integer> duplicate = new ArrayList<>();


        for(int i : arr){
            if(unique.contains(i)){
                duplicate.add(i);
            }
            else{
                unique.add(i);
            }
        }
        System.out.println(duplicate);
    }

    private static void secondLargest_001(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for(int i : arr){
            if(i>max){
                sMax = max;
                max = i;
            } else if (i> sMax && i!=max) {
                sMax = i;

            }
        }
        System.out.println(sMax);
    }
}
