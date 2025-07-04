package July;

import java.util.*;

public class ThirdLargestElement {
    public static void main(String[] args){
         int[] arr = {9,10,8,18,17,5,22,43,67,43,67,67,43};
         findThirdLargestElementInArray(arr);
    }

    private static void findThirdLargestElementInArray(int[] arr) {
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[arr.length-3]);
        Set<Integer> dataSet = new TreeSet<>();
        for(int i : arr)
            dataSet.add(i);
        if(dataSet.size() < 3){
            throw new IllegalArgumentException("Array SIze is less than 3");
        }
        List<Integer> sortedList = new ArrayList<>(dataSet);
        System.out.println(sortedList.get(sortedList.size()-3));
    }
}
