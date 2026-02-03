package Fenruary_2026;

import java.util.Arrays;
import java.util.Collections;

public class SecondHighestElement {
    public static void main(String[] args){
        int[] arr = {10,30,20,50,40};
        int secondMin = Arrays.stream(arr).distinct().boxed().sorted().skip(1).findFirst().get();
        System.out.println(secondMin);
        int secondMax =Arrays.stream(arr).distinct().boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondMax);


    }
}

