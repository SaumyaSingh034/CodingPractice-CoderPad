package July2026;

import java.util.*;

public class TopKFrequentElement {
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,3};
        int k = 2;
        topKFrequentElement(arr, k);
    }

    private static void topKFrequentElement(int[] arr, int k) {
        Map<Integer, Integer> hashMap = new LinkedHashMap<>();
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );
        for(int i : arr){
            hashMap.put(i, hashMap.getOrDefault(i, 0)+1);
        }
        pq.addAll(hashMap.entrySet());
        while(k-- > 0){
            result.add(pq.poll().getKey());
        }
     System.out.println(result);
    }
}
