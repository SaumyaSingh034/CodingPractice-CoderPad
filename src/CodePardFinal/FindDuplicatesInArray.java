package CodePardFinal;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {
    public static void main(String[] args){
        int[] arr = {3,4,5,2,2,6,1,4,6,8,8};
        findDulplicatesArray(arr);
    }

    private static void findDulplicatesArray(int[] arr) {
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for(int i : arr){
            if(!unique.add(i))
                duplicate.add(i);
        }
        System.out.println("Unique : "+unique);
        System.out.println("Duplicate : "+duplicate);
    }
}
