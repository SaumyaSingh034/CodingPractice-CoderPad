package InterviewPreparation;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayByLastDigit {
    public static void main(String[] args){
        Integer[] arr = {27, 13, 45, 82, 39, 91};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return (a%10) - (b%10);
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
