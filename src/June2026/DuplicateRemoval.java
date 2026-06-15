package June2026;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemoval {
    public static void main(String[] args){

        int[] arr = {7,3,1,2,3,4,5,6,7,1,2,3,4,5,6,7,8,9,9,8,7,5};
        removeDuplicatesFromArray76(arr);
    }

    private static void removeDuplicatesFromArray76(int[] arr) {
        Set<Integer> unique = new HashSet<>();
        List<Integer> data = new ArrayList<>();
        for(int i : arr){
            if(!unique.contains(i)){
                unique.add(i);
                data.add(i);
            }
        }
        System.out.println(data);
    }
}
