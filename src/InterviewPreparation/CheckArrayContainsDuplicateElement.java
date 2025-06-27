package InterviewPreparation;

import java.util.LinkedHashSet;
import java.util.Set;

public class CheckArrayContainsDuplicateElement {
    public static void main(String[] args){
        int[] arr = {1,1,1,1,2,2,2,2,3,4,3,4,5};
        checkArrayContainsDuplicateElement(arr);
    }

    private static void checkArrayContainsDuplicateElement(int[] arr) {
        Set<Integer> dataMap = new LinkedHashSet<>();
        Set<Integer> duplicateDataMap = new LinkedHashSet<>();
        for(int i : arr){
            if(!dataMap.add(i)){
                duplicateDataMap.add(i);
            }
        }
        System.out.println(dataMap);
        System.out.println(duplicateDataMap);

    }
}
