package May2026;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] ars = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8};
        Set<Integer> data = new LinkedHashSet<>();
        for(int i: ars){
            data.add(i);
        }
        System.out.println(data);
    }
}
