package Beginner;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {
    public static void main(String[] args){
        int data[] = {1,2,2,3,4,5,4,3,6,7,6,6,8};
        printDuplicates(data);
        removeDuplicatesFromArray(data);
    }

    private static void removeDuplicatesFromArray(int[] data) {
        Set<Integer> unique = new HashSet<>();
        for(int i : data){
            unique.add(i);
        }
        System.out.println(unique);
    }

    private static void printDuplicates(int[] data) {
        Set<Integer> unique = new HashSet<>();
        for(int i : data){
            if(!unique.add(i))
                System.out.print(i+" ");
        }
    }
}
