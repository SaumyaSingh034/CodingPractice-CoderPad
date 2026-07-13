package July2026;

import java.util.*;

public class K_FrequentElement {
    public static void main(String[] args){
        int nums[] = {1,1,1,2,2,3};
        int k = 2;
        kMostFrequentElement(nums, k);
    }

    private static void kMostFrequentElement(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i : nums){
            hashMap.put(i, hashMap.getOrDefault(i, 0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort(Comparator.comparing(Map.Entry<Integer, Integer>::getValue).reversed());
        for(int i=0;i<k;i++){
            System.out.println(list.get(i).getKey());
        }

    }
}
