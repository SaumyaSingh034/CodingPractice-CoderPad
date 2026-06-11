package June2026;

import java.util.*;

public class UniqueArray {
    public static void main(String[] args){
        int[] arr={1,2,3,2,4,5,1};
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
}
