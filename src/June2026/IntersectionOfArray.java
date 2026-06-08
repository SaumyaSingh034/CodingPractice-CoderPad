package June2026;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6};

        Set<Integer> set = new HashSet<>();
        for(int i: arr1){
            set.add(i);
        }

        for(int i: arr2){
            if(set.contains(i))
                System.out.print(i+" ");
        }
    }
}
